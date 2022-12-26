package co.ramirolynch.hibernate_proj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.ramirolynch.hibernate_proj.entity.Student;
import co.ramirolynch.hibernate_proj.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		// approach 1
		/*
		Student st = new Student(101,"Ramiro", "ramiro@gmail.com");
		session.delete(st);
		*/
		
		// approach 2
		Student st = session.get(Student.class, 103);
		
		
		if(st!=null) {
		System.out.println(st.toString());
		session.delete(st); 
		}
		else {
			System.out.println("no matching student found");
		}
		
		
		
		tx.commit();
		
		session.close();
		sfactory.close();

	}

}
