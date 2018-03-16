package org.food.supplier.dao.impl;

import org.food.supplier.dao.CountryDAO;
import org.food.supplier.domain.Country;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDAOImpl implements CountryDAO{
	
	@Autowired
	@Qualifier("hibernate3AnnotatedSessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public Country getCountryById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Country.class);
		criteria.add(Restrictions.eq("id", id));
		Country country = (Country) criteria.uniqueResult();
		session.clear();
		return country;
	}
	
	

	@Override
	public Country getCountryByName(String name) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Country.class);
		criteria.add(Restrictions.eq("name", name));
		Country country = (Country) criteria.uniqueResult();
		session.close();
		return country;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}
