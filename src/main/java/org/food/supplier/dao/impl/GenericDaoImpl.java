package org.food.supplier.dao.impl;

import org.food.supplier.dao.GenericDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GenericDaoImpl implements GenericDao {

	@Autowired
	@Qualifier("hibernate3AnnotatedSessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public Object save(Object obj) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Object object = session.save(obj);
		session.close();
		return object;
	}
}
