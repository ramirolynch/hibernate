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


		String hql = "from Student";

		Query<Student> query = session.createQuery(hql, Student.class);
		List<Student> rows = query.getResultList();

		for (Student row : rows) {
			System.out.println(row);
			try {
				Thread.sleep(1000);

			} catch (Exception ex) {

			}
		}
		
		session.close();
		sfactory.close();
	}

}
