package com.spring.jdbcDemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbcDemo.model.Student;

public class StudentRowMapperImpl implements RowMapper<Student> {

	public StudentRowMapperImpl() {
		// TODO Auto-generated constructor stub
	}

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student s=new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
		return s;
	}

}
