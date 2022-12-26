package co.ramirolynch.hibernate_proj;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import co.ramirolynch.hibernate_proj.entity.Student;
import co.ramirolynch.hibernate_proj.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// insert 10 student records
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();

        /*
		//String hql = "from Student";
		//String hql = "from Student where studentName = 'RAMIRO'";
		//String hql = "from Student where studentName like 'R%'";
		//String hql = "from Student where studentId in (101,102,104)";
		Query<Student> query = session.createQuery(hql, Student.class);
		*/
		
		/*
		String hql = "from Student where studentId between ?0 and ?1"; // positional parameters
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter(0, 100);
		query.setParameter(1, 110);
		*/
		
		/*
		String hql = "from Student where studentId between :minsid and :maxsid"; // named parameters
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("minsid", 50);
		query.setParameter("maxsid", 200);
		
		
		List<Student> rows = query.getResultList();

		for (Student row : rows) {
			System.out.println(row);
			try {
				Thread.sleep(1000);

			} catch (Exception ex) {

			}
		}
		*/
		
		session.beginTransaction();
		String hql = "update Student set studentName = 'Ramiro' where studentId=101";
		Query query = session.createQuery(hql);
		int studsUpdated = query.executeUpdate();
		System.out.println("number of students updated: "+studsUpdated);
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}

}
