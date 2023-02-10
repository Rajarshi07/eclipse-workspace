package com.hibernate.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddStudents {

	public AddStudents() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/HibernateProject/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		String cities[]= {"Kolkata","Delhi","Mumbai","Chennai"};

		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		for(int i=1;i<=20;i++) {

		session.save(new Student("Student Name"+i,cities[(int)(Math.random() * 4  )]));
		}
		tx.commit();
		session.close();


	}

}
