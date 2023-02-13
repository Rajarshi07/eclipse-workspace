package com.hibernate.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevlCaching {

//	public SecondLevlCaching() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/HibernateProject/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s1 = factory.openSession();
		Student stu1 = s1.get(Student.class, 11);
		System.out.println(stu1);
		s1.close();
		Session s2 = factory.openSession();
		Student stu2 = s2.get(Student.class, 11);
		System.out.println(stu2);
		s2.close();

	}

}
