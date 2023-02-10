package com.hibernate.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {

	public EmbeddableDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("ST1","CT1");
		Student s2=new Student("ST2","CT2");
		Student s3=new Student("ST3","CT3");
		s1.setCert(new Certificate("CO1","5w"));
		s2.setCert(new Certificate("CO2","6w"));
		s3.setCert(new Certificate("CO3","7w"));
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/HibernateProject/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);
		tx.commit();
		session.close();
		return;
	}

}
