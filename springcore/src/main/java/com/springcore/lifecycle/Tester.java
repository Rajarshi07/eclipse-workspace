package com.springcore.lifecycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public Tester() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext ctx =  new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//        Item i1=(Item)ctx.getBean("item1");
//        System.out.println(i1);
//        Item i2=(Item)ctx.getBean("item2");
//        System.out.println(i2);
        SecondItem i3=(SecondItem)ctx.getBean("item3");
        System.out.println(i3);
        ctx.registerShutdownHook();
        return;
	}

}
