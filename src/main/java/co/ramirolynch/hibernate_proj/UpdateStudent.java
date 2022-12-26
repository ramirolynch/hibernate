package co.ramirolynch.hibernate_proj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.ramirolynch.hibernate_proj.entity.Student;
import co.ramirolynch.hibernate_proj.utils.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		// approach 1
		/*
		Student st = new Student(101,"Ramiro", "ramiro@gmail.com");
		session.update(st);
		*/
		
		// approach 2
		Student st = session.get(Student.class, 101);
		
		
		if(st!=null) {
		System.out.println(st.toString());
		st.setStudentName("RAMIRO"); // dirty object
		}
		else {
			System.out.println("no matching student found");
		}
		
		
		
		tx.commit();
		
		session.close();
		sfactory.close();

	}

}
