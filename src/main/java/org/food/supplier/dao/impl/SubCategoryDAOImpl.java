package org.food.supplier.dao.impl;

import java.util.List;

import org.food.supplier.dao.SubCategoryDAO;
import org.food.supplier.domain.SubCategory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class SubCategoryDAOImpl implements SubCategoryDAO{

	@Autowired
	@Qualifier("hibernate3AnnotatedSessionFactory")
	SessionFactory sessionFactory;
	
	@Override
	public SubCategory getSubCategoryById(Integer id) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(SubCategory.class);
		criteria.add(Restrictions.eq("subCatId", id));
		SubCategory subCategory = (SubCategory) criteria.uniqueResult();
		return subCategory;
	}

	@Override
	public List<SubCategory> getSubCategory() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(SubCategory.class);
		List<SubCategory> subCategory = criteria.list();
		return subCategory;
	}

	@Override
	public void save(SubCategory subCategory) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(subCategory);
		tx.commit();
		session.close();
	}

	

}
