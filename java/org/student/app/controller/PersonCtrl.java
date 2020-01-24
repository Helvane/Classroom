package org.student.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.student.app.model.Student;
import org.student.app.service.StudentService;

@RestController
@RequestMapping("/api")
public class PersonCtrl {

	@Autowired
	private StudentService studentSrv;
	
	@GetMapping("/allstudent")
	public List<Student> getAllStudent() {
		return this.studentSrv.getStudents();
	}
}
