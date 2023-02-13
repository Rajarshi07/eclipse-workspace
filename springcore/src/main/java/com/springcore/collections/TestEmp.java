package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ApplicationContext ctx =  new ClassPathXmlApplicationContext("com/springcore/collections/config.xml");
        Emp e1 = (Emp)ctx.getBean("emp1");
        System.out.println(e1);
	}

}
