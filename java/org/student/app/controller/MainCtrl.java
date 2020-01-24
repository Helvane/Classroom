package org.student.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.student.app.model.Student;

@Controller
public class MainCtrl {

	@GetMapping("/index")
	public String getIndex(@ModelAttribute ("x") Student s) {
		s.setName("John Smith");
		s.setStreet("12 high st");
		s.setName2("Kim");
		s.setStreet2("3 lane st");
		s.setZipCode("01852");
		s.setAbbreviation("MA");
		return "index";
	}
}
