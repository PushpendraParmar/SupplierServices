package org.food.supplier.dao;

import java.util.List;

import org.food.supplier.domain.Enquiry;
import org.food.supplier.views.EnquiryView;

public interface EnquiryDAO extends GenericDao {
	public Enquiry GetEnquiryBy(Long id);
	public List<Enquiry> GetAllEnquiries();
	public List<Enquiry> GetEnquiriesBy(String mobile, String email);
}
