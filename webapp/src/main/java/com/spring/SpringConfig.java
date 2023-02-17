package com.spring;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.spring.dao.EmplDao;

@Configuration
@ComponentScan({"com.spring.controller"})
@EnableWebMvc
@EnableTransactionManagement
public class SpringConfig {
	
	@Bean
	public InternalResourceViewResolver getViewRes() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
	@Bean(name = "ds")
	public DriverManagerDataSource ds() {
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/db1?useSSL=false");
		ds.setUsername("rajarshi");
		ds.setPassword("ihsrajar");
		return ds;
	}
	
	@Bean(name = "jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate t=new JdbcTemplate();
		t.setDataSource(ds());
		return t;
	}
	
	@Bean(name = "factory")
	public LocalSessionFactoryBean getSessionFactoryBean() {
		LocalSessionFactoryBean lb=new LocalSessionFactoryBean();
		Properties hibernateProperties=new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		lb.setDataSource(ds());
		lb.setHibernateProperties(hibernateProperties);
		lb.setAnnotatedClasses(new Class[] {
			com.spring.model.Empl.class,
		});
		return lb;
	}
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager tm=new HibernateTransactionManager();
//		tm.setAutodetectDataSource(true);
//		tm.setBeanFactory((BeanFactory)getBeanFactory());
		tm.setSessionFactory(getSessionFactoryBean().getObject());
		return tm;
	}
	@Bean(name="hibernateTemplate")
	public HibernateTemplate getHibernateTemplate() {
		HibernateTemplate t= new HibernateTemplate();
		t.setSessionFactory(getSessionFactoryBean().getObject());
		return t;
	}
	@Bean(name="emplDao")
	public EmplDao getEmplDao() {
		EmplDao dao=new EmplDao();
		dao.setHibernateTemplate(getHibernateTemplate());
		return dao;
	}

	public SpringConfig() {
		// TODO Auto-generated constructor stub
	}

}
