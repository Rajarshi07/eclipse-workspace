package com.springcore.assignment1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.component.Student;

public class Test {
	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springcore/assignment1/config.xml");
		Person p1 = ctx.getBean("p1", Person.class);
		System.out.println(p1);
	}
}
