package com.hibernate.HibernateProject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Update {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/HibernateProject/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		System.out.println("Hello World!");

		Scanner scan = new Scanner(System.in);

		Session session = factory.openSession();
		System.out.print("enter student id to update:");
		Student s= session.get(Student.class, scan.nextInt());
		if(s!=null) {
			System.out.println("enter new city:");
			s.setCity(scan.next());
			Transaction tx= session.beginTransaction();
			session.save(s);
			tx.commit();

		}else {
			System.out.println("Invalid student id..");
		}
		session.close();
		System.out.println(s);

	}
}
