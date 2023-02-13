package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.Address;
import com.springcore.ref.Student;

public class testCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("com/springcore/constructorInjection/config.xml");
        Certi c1=(Certi)ctx.getBean("c1");
        System.out.println(c1);
        Certi c2=(Certi)ctx.getBean("c2");
        System.out.println(c2);
        Person p1=(Person)ctx.getBean("p1");
        System.out.println(p1);
        Person p2=(Person)ctx.getBean("p2");
        System.out.println(p2);


	}

}
