package com.mapping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapSelect {

	public MapSelect() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/HibernateProject/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		QuestionO2M qm=session.get(QuestionO2M.class, 1);
		if(qm!=null) {
			List<Answer> ans=qm.getAns();
			System.out.println(qm.toString());
			for(Answer a:ans) System.out.println(a.toString());
		}
		tx.commit();
		session.close();
		return;
	}

}
