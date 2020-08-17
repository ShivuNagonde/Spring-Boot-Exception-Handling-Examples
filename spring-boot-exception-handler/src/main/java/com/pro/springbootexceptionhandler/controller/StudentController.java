package com.pro.springbootexceptionhandler.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.springbootexceptionhandler.exception.InvalideFieldException;
import com.pro.springbootexceptionhandler.model.Student;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@PostMapping
	public String saveStudentInformation(@RequestBody Student student) {
	if(StringUtils.isEmpty(student.getLastname()))	{
		throw new InvalideFieldException("Last name is required field");
	}
	return "Data is saved!!";
	}
	
	//@ExceptionHandler annotation is active only a controller in feature we use this 
	//in multiple controller we need to segreegate this,
	//so we need to create one more class i.e.StudendExceptionHandler
	/*
	 * @ExceptionHandler public String
	 * handleInvalideFieldException(InvalideFieldException exception ) { return
	 * exception.getMessage(); }
	 */
}
