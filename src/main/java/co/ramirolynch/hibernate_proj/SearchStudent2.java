package co.ramirolynch.hibernate_proj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.ramirolynch.hibernate_proj.entity.Student;
import co.ramirolynch.hibernate_proj.utils.HibernateUtils;

public class SearchStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		//Student st = session.get(Student.class, 101);
		Student st = session.get(Student.class, 1016);
		
		if(st!=null) {
		System.out.println(st.toString());
		}
		else {
			System.out.println("no matching student found");
		}
		
		session.close();
		sfactory.close();

	}

}


