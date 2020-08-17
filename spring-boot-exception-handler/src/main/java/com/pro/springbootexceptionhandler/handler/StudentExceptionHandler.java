package com.pro.springbootexceptionhandler.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.pro.springbootexceptionhandler.exception.InvalideFieldException;

//@ControllerAdvice -->this annotation is used with @ResponseBody annotation 
@RestControllerAdvice //@RestControllerAdvice-->this is equal to @ControllerAdvice and @ResponseBody both.
public class StudentExceptionHandler {

	@ExceptionHandler
	//@ResponseBody -->it converts JSON error msg into HTTP return message
    public String handleInvalideFieldException(InvalideFieldException exception ) {
		return exception.getMessage(); }
}
