package org.student.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class VendorCtrl {
	// declare private variable
	private String ip_url;
	

	private RestTemplate restTemplate;

	// constructor has injection from application.properties file.
	public VendorCtrl(
	  @Value("${config.ip.url}") String ipUrl		
			
	) {
		super();
		this.ip_url = ipUrl;
		System.out.println("*** ip_url = " + this.ip_url);
		
		this.restTemplate = new RestTemplate();
	}
	
	@GetMapping("/ip")
	public String getdata() {
		String response = this.restTemplate.getForObject(this.ip_url, String.class);
		return this.ip_url;
	}
	
	

}
