package com.spring.jdbcDemo.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbcDemo.model.Student;

public class StudentDaoImpl implements StudentDao {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public StudentDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int insert(Student student) {
		// TODO Auto-generated method stub
		// insert query
		String q = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(q, student.getId(), student.getName(), student.getCity());
		return r;
	}

	public int modify(Student student) {
		// update query
		String q = "update student set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(q, student.getName(), student.getCity(), student.getId());
		return r;
	}

	public int delete(int id) {
		// delete query
		String q = "delete from Student where id=?";
		int r = this.jdbcTemplate.update(q, id);
		return r;
	}

	public Student getStudent(int id) {
		// select query
		String q = "select id,name,city from student where id=?";
		Student s=this.jdbcTemplate.queryForObject(q, new StudentRowMapperImpl(),id);
		return s;
	}

	public List<Student> getAllStudents() {
		// select all query
		String q="select id,name,city from student;";
		List<Student> s=this.jdbcTemplate.query(q,  new StudentRowMapperImpl());
		return s;
	}

}
