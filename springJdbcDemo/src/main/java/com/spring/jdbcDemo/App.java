package com.spring.jdbcDemo;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbcDemo.dao.StudentDao;
import com.spring.jdbcDemo.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
    	StudentDao sd = ctx.getBean("studentDao",StudentDao.class);
    	Student s1=new Student(102,"Swairik","Howrah");
    	// insert
//    	int r=sd.insert(s1);
//    	System.out.println(r+" row(s) inserted");
    	
    	// update
//    	s1.setCity("Kolkata");
//    	int r=sd.modify(s1);
//    	System.out.println(r+" row(s) updated");
    	
    	//delete
//    	int r=sd.delete(102);
//    	System.out.println(r+" row(s) deleted");
    	
    	// fetch row
//    	Student s=sd.getStudent(1);
//    	System.out.println(s);
    	
    	// fetch all students
    	List<Student> studentList=sd.getAllStudents();
    	for(Student s:studentList)System.out.println(s);
    }
}
