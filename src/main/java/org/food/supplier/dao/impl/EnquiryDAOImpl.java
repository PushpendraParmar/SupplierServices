package org.food.supplier.dao.impl;

import java.util.List;

import org.food.supplier.controllers.EnquiryController;
import org.food.supplier.dao.EnquiryDAO;
import org.food.supplier.domain.Enquiry;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class EnquiryDAOImpl extends GenericDaoImpl implements EnquiryDAO {

	@Autowired
	@Qualifier("hibernate3AnnotatedSessionFactory")
	private SessionFactory sessionFactory ;
	
	@Override
	public List<Enquiry> GetAllEnquiries() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Enquiry.class);
		List<Enquiry> enquiries = criteria.list();
		session.close();
		return enquiries;
	}

	@Override
	public Enquiry GetEnquiryBy(Long id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Enquiry.class);
		criteria.add(Restrictions.eq("id", id));
		Enquiry enquiry =(Enquiry)criteria.uniqueResult();
		session.close();
		
		return enquiry;
	}

	@Override
	public List<Enquiry> GetEnquiriesBy(String mobile, String email) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Enquiry.class);
		criteria.add(Restrictions.eq("mobile",mobile)).add(Restrictions.eq(email, email));
		List<Enquiry> enquiries = criteria.list();
		session.close();
		return enquiries;
	}

}
