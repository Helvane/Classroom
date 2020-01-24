package org.student.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.student.app.model.Person;
import org.student.app.model.Student;

@Service
public class StudentService {

	private List<Student> students;
	
	private List<Person> people;

	public StudentService() {
		super();
		// initialize variable to empty array
		this.students = new ArrayList<>();
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}
	
	
	
}
