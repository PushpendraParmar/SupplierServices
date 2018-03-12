package org.food.supplier.dao.impl;

import java.util.List;

import org.food.supplier.dao.CartDAO;
import org.food.supplier.domain.Cart;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAOImpl implements CartDAO{

	@Autowired
	@Qualifier("hibernate3AnnotatedSessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public Cart getCartById(Integer id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Cart.class);
		criteria.add(Restrictions.eq("cartId", id));
		Cart cart = (Cart) criteria.uniqueResult();
		session.close();
		return cart;
	}

	@Override
	public List<Cart> getCart() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Cart.class);
		List<Cart> cart = criteria.list();
		session.close();
		return cart;
	}
	
	@Override
	public void save(Cart cart) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(cart);
		tx.commit();
		session.close();		
	}


}
