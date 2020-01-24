package org.student.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.student.app.model.Business;
import org.student.app.service.BusinessService;

@RestController
@RequestMapping("/api")
public class BusinessCtrl {

	@Autowired
	private BusinessService businessService;
	
	@PostMapping("/savebusiness")
	public Business  x(@RequestBody Business business) {
		List<Business> x = this.businessService.getBusiness();
		x.add(business);
		this.businessService.setBusiness(x);
		return business;
	}
		
	@GetMapping("/allbusiness")
	public List<Business> getBusiness() {
		return this.businessService.getBusiness();
	}
	
	
}
