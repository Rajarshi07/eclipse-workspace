package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("config.xml");
        Student s1 = (Student)ctx.getBean("student1");
        System.out.println(s1);
        Student s2 = (Student)ctx.getBean("student2");
        System.out.println(s2);
        Student s3 = (Student)ctx.getBean("student3");
        System.out.println(s3);
    }
}
