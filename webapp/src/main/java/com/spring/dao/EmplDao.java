package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.model.Empl;


public class EmplDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Empl s) {
		int i = (Integer) this.hibernateTemplate.save(s);
		return i;
	}

	public Empl getEmpl(int id) {
		Empl s = this.hibernateTemplate.get(Empl.class, id);
		return s;
	}

	public List<Empl> getAllEmpl() {
		List<Empl> s = this.hibernateTemplate.loadAll(Empl.class);
		return s;
	}

	@Transactional
	public void delete(int id) {
		Empl s = getEmpl(id);
		try {
			this.hibernateTemplate.delete(s);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	@Transactional
	public void update(Empl s) {
		try {
			this.hibernateTemplate.update(s);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	

	public EmplDao() {
		// TODO Auto-generated constructor stub
	}

}
