package com.wizpanda.studentLogin.studentController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wizpanda.studentLogin.model.Student;
import com.wizpanda.studentLogin.model.StudentLogin;
import com.wizpanda.studentLogin.services.StudentServices;


@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentServices studentservice;
	@GetMapping("/login")
	public void StudentLogin(@RequestBody StudentLogin studentlogin) {
	

		//	System.out.print("login");
		
	}
	@PostMapping("/create")
	//@ResponseStatus(HttpStatus.CREATED)
	public void studentCreate( @Valid @RequestBody Student student) {
		
		studentservice.studentCreate(student);
		System.out.println(studentservice.studentList());
		}
	
	@GetMapping("/students")
	public List<Student> studentList() {
		return studentservice.studentList();

	}
	
}
