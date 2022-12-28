package co.ramirolynch.hibernate_proj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.ramirolynch.hibernate_proj.entity.Product;
import co.ramirolynch.hibernate_proj.entity.Student;
import co.ramirolynch.hibernate_proj.utils.HibernateUtils;

public class SaveProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		Product pr = new Product();
		pr.setProductId(101);
		pr.setProductName("Computer");
		pr.setProductPrice(1550f);

		session.save(pr);

		System.out.println("---------------------------------------------");

		tx.commit();
		session.close();
		sfactory.close();

	}

}
