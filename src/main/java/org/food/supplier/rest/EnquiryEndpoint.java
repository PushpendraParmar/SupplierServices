package org.food.supplier.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.food.supplier.views.EnquiryView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/enquiry/")
public interface EnquiryEndpoint {

	@RequestMapping(value="enquiries", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<EnquiryView> getEnquiries();
	
	//@RequestMapping(value="{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	@RequestMapping(value="getEnquiry/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public EnquiryView getEnquiry(Long id);
	
	@RequestMapping(value="getEnquiryByMobileOrEmail", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<EnquiryView> getEnquiryBy(String mobile, String email);
	
	@RequestMapping(value="saveEnquiries", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON)
	public Boolean saveEnquiries(EnquiryView enquiryView);
	
}
