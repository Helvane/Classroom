package org.student.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.student.app.StudentApplication;
import org.student.app.model.Person;
import org.student.app.model.School;
import org.student.app.model.Student;
import org.student.app.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentCtrl {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public Student getStudent() {
		School p = new School("Lowell High","33 moore street");
		
		
		// instantiate a class - you call a class
		Student s = new Student("Umass of Lowell College", "14 broadway");
		s.setName2("John Smith");
		s.setStreet2("12 High st. Lowell, MA.");
		s.setName("Lowell High School");
		s.setStreet("32 Middle St. Lowell, MA");
		s.setZipCode("01854");
		s.setAbbreviation("MA");
		
		// I retrieve static variables from StudentApplication class
		String url1 = StudentApplication.url1;
		String url2 = StudentApplication.url2;
		
		s.setUrl1(url1);
		s.setUrl2(url2);
		
		return s;
	}
	
	@GetMapping("/person")
	public Map<String, String> getPerson(){
		Map<String, String> data = new HashMap<>();
		Person p = new Person();
		p.setName("John Smith");	
		
		data.put("x", p.getName());
		data.put("y", p.name);
		data.put("w", "55");
		
		System.out.println(data.get("name"));
		
		return data;
		
	}
	
	@GetMapping("/list")
	public List<String> getList() {
		// declare a list variable
		List<String> myList = new ArrayList<>();
		myList.add("John");
		myList.add("Hi");
		myList.add("Jack");
		
		return myList;
	}
	
	@PostMapping("/save")
	public List<Student> saveStudent(@RequestBody Student student) {
	
		// call a getter method from studentService
		List<Student> mylist = this.studentService.getStudents();
		mylist.add(student);
		this.studentService.setStudents(mylist);
		
		return mylist;
	}
	
	@PutMapping("/update")
	public List<Student> updateStudent(@RequestBody Student student) {
		// call a getter method from studentService
		List<Student> mylist = this.studentService.getStudents();
		for(Student item : mylist) {
			if(item.getName().equalsIgnoreCase(student.getName())) {
				item.setStreet(student.getStreet());
				item.setName2(student.getName2());
				item.setStreet2(student.getStreet2());
				item.setAbbreviation(student.getAbbreviation());
				item.setZipCode(student.getZipCode());
				item = student;
			}
		}
		
		mylist.add(student);
		this.studentService.setStudents(mylist);
		
		return this.studentService.getStudents();
	}
	
	@DeleteMapping("/delete/{id}") 
	public List<Student> deleteStudent(@PathVariable("id") int id) {
		List<Student> mylist = this.studentService.getStudents();
		mylist.remove(id);
		return mylist;
	}
		
	
	
}
