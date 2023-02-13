package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public TestRef() {
		// TODO Auto-generated constructor stub

	}
	public static void main(String[] args) {

        ApplicationContext ctx =  new ClassPathXmlApplicationContext("com/springcore/ref/config.xml");
        B b1 = (B)ctx.getBean("b1");
        A a1 = (A)ctx.getBean("a1");
        A a2 = (A)ctx.getBean("a2");
        A a3 = (A)ctx.getBean("a3");
        System.out.println(b1);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
	}

}
