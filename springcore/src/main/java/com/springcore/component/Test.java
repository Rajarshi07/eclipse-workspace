package com.springcore.component;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx =  new ClassPathXmlApplicationContext("com/springcore/component/config.xml");
		Student s=ctx.getBean("student1",Student.class);
		System.out.println(s);
		
	}

}
