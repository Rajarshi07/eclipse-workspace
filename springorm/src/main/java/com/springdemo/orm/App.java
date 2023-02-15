package com.springdemo.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.orm.dao.StudentDao;
import com.springdemo.orm.model.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
    	StudentDao sd = ctx.getBean("studentDao",StudentDao.class);
    	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean ch = true;
		
		while (ch) {
			System.out.println("Press 1 to add new student");
			System.out.println("Press 2 to display student detail");
			System.out.println("Press 3 to display all students");
			System.out.println("Press 4 to delete student");
			System.out.println("Press 5 to update student details");
			System.out.println("Press 6 to exit");

			try {
				int input = Integer.parseInt(br.readLine());
				switch(input) {
					case 1 : 
						System.out.println("Enter Student Id : ");
						int sid = Integer.parseInt(br.readLine());
						System.out.println("Enter student name : ");
						String sname = br.readLine();
						System.out.println("Enter student city : ");
						String scity = br.readLine();
						
						Student s1 = new Student(sid, sname, scity);
						
						int r = sd.insert(s1);

						System.out.println(r + " student inserted");
						break;
					case 2:
						System.out.println("Enter student id : ");
						int stid = Integer.parseInt(br.readLine());
						Student student = sd.getStudent(stid);
						System.out.println(student);
						break;
					case 3:
						List<Student> students = sd.getAllStudents();
						for (Student s : students) {
							System.out.println(s);
						}
						break;
					case 4:
						System.out.println("Enter student id : ");
						int stuid = Integer.parseInt(br.readLine());
						sd.delete(stuid);
						break;
					case 5:
						System.out.println("Enter student id : ");
						int studid = Integer.parseInt(br.readLine());
						System.out.println("Enter student name : ");
						String studname = br.readLine();
						System.out.println("Enter student city : ");
						String studcity = br.readLine();

						Student s2 = new Student(studid, studname, studcity);
						sd.update(s2);

						break;
					default:
						System.out.println("Wrong input");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
//    	Student s1=new Student(101,"Rajarshi","Kolkata");
//    	Student s2=new Student(102,"Swairik","Howrah");
    	 //insert
//    	int r1=sd.insert(s1);
//    	System.out.println(r1+" row(s) inserted");
//    	int r2=sd.insert(s2);
//    	System.out.println(r2+" row(s) inserted");
    	
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
//    	List<Student> studentList=sd.getAllStudents();
//    	for(Student s:studentList)System.out.println(s);
    }
}
