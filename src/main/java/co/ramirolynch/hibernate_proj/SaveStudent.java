package co.ramirolynch.hibernate_proj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.ramirolynch.hibernate_proj.entity.Student;

public class SaveStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sfactory = config.buildSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		Student st = new Student();
		st.setStudentId(101);
		st.setStudentName("Veronica");
		st.setStudentEmail("veronica@gmail.com");
		
		session.save(st);
		
		System.out.println("---------------------------------------------");
		
		tx.commit();
		session.close();
		sfactory.close();

	}

}
