package com.hibernate.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Select {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/HibernateProject/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		System.out.println("Hello World!");

		Session session = factory.openSession();
		session.flush();
		Transaction tx= session.beginTransaction();
		tx.commit();
		session.close();


//		System.out.println(s);

	}
}
