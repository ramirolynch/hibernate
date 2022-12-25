package co.ramirolynch.hibernate_proj;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.ramirolynch.hibernate_proj.entity.Student;
import co.ramirolynch.hibernate_proj.utils.HibernateUtils;

public class SaveStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		String req = "y";
		
		while(req.equalsIgnoreCase("Y")) {
			System.out.println("enter student name: ");
			String name = sc.nextLine();
			System.out.println("enter student email: ");
			String email = sc.nextLine();
			
			Student st = new Student(name, email);
			session.save(st);
			System.out.println("Do you want to save more students?");
			req = sc.nextLine();
		}//while
		tx.commit();
		session.close();
		sfactory.close();

	}

}
