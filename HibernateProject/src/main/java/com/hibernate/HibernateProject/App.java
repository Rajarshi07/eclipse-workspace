package com.hibernate.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/HibernateProject/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		System.out.println("Hello World!");

		Student s=new Student("rajarshi","kolkata");

		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();


		System.out.println(s);

	}
}
