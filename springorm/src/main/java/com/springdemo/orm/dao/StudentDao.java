package com.springdemo.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springdemo.orm.model.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Student s) {
		int i = (Integer) this.hibernateTemplate.save(s);
		return i;
	}

	public Student getStudent(int id) {
		Student s = this.hibernateTemplate.get(Student.class, id);
		return s;
	}

	public List<Student> getAllStudents() {
		List<Student> s = this.hibernateTemplate.loadAll(Student.class);
		return s;
	}

	@Transactional
	public void delete(int id) {
		Student s = getStudent(id);
		try {
			this.hibernateTemplate.delete(s);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	@Transactional
	public void update(Student s) {
		try {
			this.hibernateTemplate.update(s);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	public StudentDao() {
		// TODO Auto-generated constructor stub
	}

}
