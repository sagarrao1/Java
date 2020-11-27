package com.naveen.SpringMvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.naveen.SpringMvc.model.Alian;

@Component
public class AlianDao {
	
	@Autowired
	SessionFactory sessionFactory;	
	
	@Transactional
	public List<Alian> getAlians(){		
		Session session = sessionFactory.getCurrentSession();
		List<Alian> alians = session.createQuery("from Alian", Alian.class).list();				
		return alians;		
	}
	
	@Transactional
	public void addAlian(Alian a) {
		Session session = sessionFactory.getCurrentSession();
		session.save(a);		
	}

	@Transactional
	public Alian getAlian(int aid) {
		Session session = sessionFactory.getCurrentSession();
		Alian a = session.get(Alian.class,aid);
		return a;
	}

}
