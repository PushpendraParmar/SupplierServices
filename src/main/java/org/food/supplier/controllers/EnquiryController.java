package org.food.supplier.controllers;

import java.util.List;

import org.food.supplier.rest.EnquiryEndpoint;
import org.food.supplier.services.EnquiryService;
import org.food.supplier.views.EnquiryView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EnquiryController implements EnquiryEndpoint {

	@Autowired
	private EnquiryService enquiryService;
	@Override
	public @ResponseBody List<EnquiryView> getEnquiries() {
		// TODO Auto-generated method stub
		return enquiryService.getEnquiries();
	}
	@Override
	public EnquiryView getEnquiry(Long id) {
		// TODO Auto-generated method stub
		return enquiryService.GetEnquiryBy(id);
	}
	@Override
	public List<EnquiryView> getEnquiryBy(String mobile, String email) {
		// TODO Auto-generated method stub
		return enquiryService.GetEnquiriesBy(mobile, email);
	}
	@Override
	public Boolean saveEnquiries() {
		// TODO Auto-generated method stub
		return null;
	}

}
