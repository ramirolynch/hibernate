package co.ramirolynch.hibernate_proj;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.ramirolynch.hibernate_proj.entity.Batch;
import co.ramirolynch.hibernate_proj.entity.Faculty;
import co.ramirolynch.hibernate_proj.utils.HibernateUtils;

public class FacultyCourseMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		Faculty faculty = new Faculty();
		faculty.setFacultyId(101);
		faculty.setFacultyName("Ramiro Lynch");
		
		Batch batch1 = new Batch(1,"Java Certification", faculty);
		Batch batch2 = new Batch(2,"Python Certification", faculty);
		Batch batch3 = new Batch(3,"Data Science Certification", faculty);
		
		Set<Batch> batches = new HashSet<Batch>();
		batches.add(batch1);
		batches.add(batch2);
		batches.add(batch3);
		
		faculty.setBatches(batches);
		
		session.save(faculty);

		System.out.println("---------------------------------------------");

		tx.commit();
		session.close();
		sfactory.close();

	}

}
