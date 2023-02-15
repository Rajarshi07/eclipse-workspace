package com.springcore.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AbstractApplicationContext ctx =  new ClassPathXmlApplicationContext("com/springcore/autowire/config.xml");
		Emp e1=(Emp)ctx.getBean("e1");
		Address a1=(Address)ctx.getBean("address");
		System.out.println(e1);
		System.out.println(a1);
		Emp e2=(Emp)ctx.getBean("e2");
//		Address a2=(Address)ctx.getBean("a2");
		System.out.println(e2);
//		System.out.println(a2);
	}
}
