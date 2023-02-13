package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public TestStudent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("com/springcore/ref/studentConfig.xml");
        Address a1=(Address)ctx.getBean("a1");
        System.out.println(a1);
        Address a2=(Address)ctx.getBean("a2");
        System.out.println(a2);
        Student s1 = (Student) ctx.getBean("s1");
        System.out.println(s1);
        Student s2 = (Student) ctx.getBean("s2");
        System.out.println(s2);

	}

}
