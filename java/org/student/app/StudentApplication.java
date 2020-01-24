package org.student.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.student.app.model.Student;

@SpringBootApplication
public class StudentApplication {
	public static String url1;
	public static String url2;

	// string of array 
	public static void main(String[] args) {
		
		if(args.length == 2) {
			url1 = args[0];
			url2 = args[1];
		}
		
		System.out.println("url1 = " + url1);
		System.out.println("url2 = " + url2);
		
		SpringApplication.run(StudentApplication.class, args);
		
		Student s = new Student("Umass", "33 broadway st. Lowell, MA. 01852");
		
		
		System.out.println(s.getName());
		System.out.println(s.getStreet());
		
		
	}

}
