package com.mapping;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapSelectM2M {

	public MapSelectM2M() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/HibernateProject/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Scanner in = new Scanner(System.in);
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		System.out.println("Enter emp id:");
		Employee qm=session.get(Employee.class, in.nextInt());
		if(qm!=null) {
			List<Project> proj=qm.getProject();
			System.out.println(qm.toString());
			for(Project a:proj) System.out.println(a);
		}
		System.out.println("Enter proj id:");
		Project pm=session.get(Project.class, in.nextInt());
		if(pm!=null) {
			List<Employee> proj=pm.getEmp();
			System.out.println(pm.toString());
			for(Employee a:proj) System.out.println(a);
		}
		
		tx.commit();
		session.close();
		return;
	}

}
