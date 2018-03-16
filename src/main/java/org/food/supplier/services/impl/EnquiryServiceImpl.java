package org.food.supplier.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.food.supplier.dao.EnquiryDAO;
import org.food.supplier.domain.Enquiry;
import org.food.supplier.services.EnquiryService;
import org.food.supplier.views.EnquiryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnquiryServiceImpl implements EnquiryService{

	@Autowired
	private EnquiryDAO enquiryDAO;
	
	@Override
	public Boolean SaveEnquiry(EnquiryView enquiry) {
		// TODO Auto-generated method stub
		enquiryDAO.save(EnquiryView.toEntity(enquiry));
		return Boolean.TRUE;
	}

	@Override
	public List<EnquiryView> getEnquiries() {
		// TODO Auto-generated method stub
		List<Enquiry> enquiries = enquiryDAO.GetAllEnquiries();
		List<EnquiryView> enquiryViews = new ArrayList<EnquiryView>(enquiries.size());
		for (Enquiry enquiry : enquiries) {
			enquiryViews.add(EnquiryView.toView(enquiry));
		}
		return enquiryViews;
	}

	@Override
	public EnquiryView GetEnquiryBy(Long id) {
		// TODO Auto-generated method stub
		Enquiry enquiry =enquiryDAO.GetEnquiryBy(id);
		return EnquiryView.toView(enquiry);
	}

	@Override
	public List<EnquiryView> GetEnquiriesBy(String mobile, String email) {
		// TODO Auto-generated method stub
		List<Enquiry> enquiries=enquiryDAO.GetEnquiriesBy(mobile, email);
		List<EnquiryView> enquirieViews= new ArrayList<EnquiryView>(enquiries.size());
		for (Enquiry enquiry : enquiries) {
			enquirieViews.add(EnquiryView.toView(enquiry));
		}
		return enquirieViews;
	}

}
