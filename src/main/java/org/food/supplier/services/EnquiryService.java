package org.food.supplier.services;

import java.util.List;

import org.food.supplier.views.EnquiryView;

public interface EnquiryService {
	public Boolean SaveEnquiry(EnquiryView enquiry);
	public List<EnquiryView> getEnquiries();
	public EnquiryView GetEnquiryBy(Long id);
	public List<EnquiryView> GetEnquiriesBy(String mobile, String email);
	
}
