package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapMany2Many {

	public MapMany2Many() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> el1=new ArrayList<>();
		List<Project> pl1=new ArrayList<>();
		List<Employee> el2=new ArrayList<>();
		List<Project> pl2=new ArrayList<>();
		for(int i=0;i<3;i++) {
			el1.add(new Employee("EMP_L1_"+(i+1)));
			pl1.add(new Project("HRMS_L1_"+(i+1)));
			el2.add(new Employee("EMP_L2_"+(i+1)));
			pl2.add(new Project("Database Module_L2"+(i+1)));
		}
		pl1.get(0).setEmp(el1);
		el1.get(2).setProject(pl2);
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/HibernateProject/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		for(Employee e:el1)session.save(e);
		for(Employee e:el2)session.save(e);
		for(Project e:pl1)session.save(e);
		for(Project e:pl2)session.save(e);

		tx.commit();
		session.close();
		return;
	}

}
