package org.student.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.student.app.model.Business;

@Service
public class BusinessService {

	private List<Business> business;

	public BusinessService() {
		super();
		
		this.business = new ArrayList<>();
	}

	public List<Business> getBusiness() {
		return business;
	}

	public void setBusiness(List<Business> business) {
		this.business = business;
	}
	
	
	
}
