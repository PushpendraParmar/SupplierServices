package org.food.supplier.dao.impl;

import java.util.List;

import org.food.supplier.dao.CategoryDAO;
import org.food.supplier.domain.Category;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDAOImpl implements CategoryDAO{

	@Autowired
	@Qualifier("hibernate3AnnotatedSessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public Category getCategoryById(Integer id) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Category.class);
		criteria.add(Restrictions.eq("categoryId", id));
		Category category = (Category) criteria.uniqueResult();
		session.close();
		return category;
	}

	@Override
	public List<Category> getCategory() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Category.class);
		List<Category> category = criteria.list();
 		return category;
	}

	@Override
	public void save(Category category) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(category);
		tx.commit();
		session.close();
		
	}

}
