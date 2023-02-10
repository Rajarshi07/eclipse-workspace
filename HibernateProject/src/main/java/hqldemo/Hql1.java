package hqldemo;


import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.HibernateProject.Student;


public class Hql1 {

	public Hql1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is hql1.java");
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/HibernateProject/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();


		Session session = factory.openSession();
		String hqlString="from Student where city=:x";
		String hqlDelete="delete from Student where id=:x";
		String hqlUpdate="update Student set city=:city where id=:id";
		Query<Student> q=session.createQuery(hqlString);
		q.setParameter("x", "Kolkata");
		List<Student> lq = q.list();
		for(Student s:lq) {
			System.out.println(s.toString());
		}
		String hqlJoin="select q.QuestionId,q.Question,a.Answer from Question as q inner join q.ans as a";
		Query q4=session.createQuery(hqlJoin);
		List<Object[]> l4=  q4.getResultList();
		for(Object[] res:l4) {
			System.out.println(Arrays.toString(res));
		}
		session.close();

	}

}
