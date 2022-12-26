package co.ramirolynch.hibernate_proj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.ramirolynch.hibernate_proj.entity.Student;
import co.ramirolynch.hibernate_proj.utils.HibernateUtils;

public class SearchStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		Student st = new Student();
		
		System.out.println(st.toString());
		
		try {
			//session.load(st, 101);
			session.load(st, 1016);
			
		}catch(Exception ex) {
			System.err.println(ex.toString());
		}
		
		System.out.println(st.toString());
		
		session.close();
		sfactory.close();

	}

}
