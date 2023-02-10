package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public MapDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/HibernateProject/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();


		Question q1=new Question("What is JSP?");
		Answer a1=new Answer("JAVA SERVER PAGES");
		q1.setAns(a1);
		Question q2=new Question("Question2?");
		Answer a2=new Answer("Ans2");
		q2.setAns(a2);
		List<Answer> a=new ArrayList<>();
		QuestionO2M qm=new QuestionO2M("What are the 4 oop concepts?");
		a.add(new Answer("Encapsulation"));
		a.add(new Answer("Polymorphism"));
		a.add(new Answer("Abstraction"));
		a.add(new Answer("inheritance"));
		qm.setAns(a);
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(q1);
		session.save(a1);
		session.save(q2);
		session.save(a2);
		session.save(qm);
		for(Answer ans:a)session.save(ans);
		tx.commit();
		session.close();
		return;
	}

}
