package org.food.supplier.views;

import org.food.supplier.domain.Enquiry;
import org.food.supplier.domain.Product;

public class EnquiryView {

	private Long id;
	
	private String name;
	
	private String mobile;
	
	private String email;
	
	private String enquiryFor;
	
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEnquiryFor() {
		return enquiryFor;
	}

	public void setEnquiryFor(String enquiryFor) {
		this.enquiryFor = enquiryFor;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public static Enquiry toEntity(EnquiryView enquiryView){
		Enquiry enq = new Enquiry();
		enq.setAddress(enquiryView.getAddress());
		enq.setName(enquiryView.getName());
		enq.setId(enquiryView.getId());
		enq.setEmail(enquiryView.getEmail());
		enq.setEnquiryFor(enquiryView.getEnquiryFor());
		enq.setMobile(enquiryView.getMobile());
		return enq;
		
	}
	public static EnquiryView toView(Enquiry enquiry){
		EnquiryView view = new EnquiryView();
		view.setAddress(enquiry.getAddress());
		view.setEmail(enquiry.getEmail());
		view.setEnquiryFor(enquiry.getEnquiryFor());
		view.setId(enquiry.getId());
		view.setMobile(enquiry.getMobile());
		view.setName(enquiry.getName());
		return view;
		
	}

}
