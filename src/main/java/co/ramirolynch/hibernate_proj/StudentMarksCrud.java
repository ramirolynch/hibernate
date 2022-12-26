package co.ramirolynch.hibernate_proj;

import java.util.ArrayList;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import co.ramirolynch.hibernate_proj.entity.StudentMarks;
import co.ramirolynch.hibernate_proj.utils.HibernateUtils;

public class StudentMarksCrud {

	public static void main(String[] args) {
		
		// insert 10 student records
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		List<StudentMarks> students = new ArrayList<StudentMarks>();
		students.add(new StudentMarks("Ricardo Perez", 33));
		students.add(new StudentMarks("Arindam Paul", 66));
		students.add(new StudentMarks("Alberto Moran", 45));
		students.add(new StudentMarks("Sharath Logan", 76));
		students.add(new StudentMarks("Gregorio Lozan", 79));
		students.add(new StudentMarks("Mark Randall", 22));
		students.add(new StudentMarks("Joe Capa", 88));
		students.add(new StudentMarks("Andres Lagomarsini", 31));
		students.add(new StudentMarks("Ruperto Noquiero", 75));
		students.add(new StudentMarks("Aldo Peti", 30));
		
		
		for(StudentMarks student:students) {
			session.save(student);
			System.out.println(student.toString());
		}
		
		tx.commit();
		
		
		// update a student record
		tx = session.beginTransaction();
        StudentMarks st = session.get(StudentMarks.class, 10);
		
		if(st!=null) {
		System.out.println(st.toString());
		st.setStudentName("RAMIRO"); // dirty object
		}
		else {
			System.out.println("no matching student found");
		}
		tx.commit();
	
			
		// delete a record if marks are less than 35
		tx = session.beginTransaction();
		String hql = "from StudentMarks";
	
		Query query = session.createQuery(hql);
		List<StudentMarks> rows = query.list();    
		
		for(StudentMarks sm:rows) {
			if(sm.getStudentScores()<35) {
			session.delete(sm);
			}
		}
		
		tx.commit();
		
		//display all records from the table
		tx = session.beginTransaction();
		query = session.createQuery(hql);
		rows = query.list(); 
		for(StudentMarks sm:rows) {
			System.out.println(sm.toString());
		}	
		
		session.close();
		sfactory.close();

	}

}
