package com.java.SpringBootExceptionHandling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.SpringBootExceptionHandling.exceptionhandling.ResourceNotFoundException;
import com.java.SpringBootExceptionHandling.model.Employee;
import com.java.SpringBootExceptionHandling.service.EmployeeService;
import com.java.SpringBootExceptionHandling.service.EmployeeServiceException;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
    //http://localhost:9091/employee
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee getEmpl() throws ResourceNotFoundException, EmployeeServiceException {
		try {
			Employee emp = employeeService.getEmployee();

			if (emp == null) {
				throw new ResourceNotFoundException("Employee not found");
			}
			return emp;
		} catch (EmployeeServiceException e) {
			throw new EmployeeServiceException("Internal Server Exception while getting exception");
		}
	}

    //no employee found so ResourceNotFoundException is thrown
	//http://localhost:9091/employee2

	@RequestMapping(value = "/employee2", method = RequestMethod.GET)
	public Employee getEmp2() throws ResourceNotFoundException, EmployeeServiceException {
		try {
			Employee emp = employeeService.getEmployeeNull();
			if (emp == null) {
				throw new ResourceNotFoundException("Employee not found");
			}

			return emp;
		} catch (EmployeeServiceException e) {
			throw new EmployeeServiceException("Internal Server Exception while getting exception");
		}
	}

    //Some exception is thrown by service layer
	//http://localhost:9091/employee3

	@RequestMapping(value = "/employee3", method = RequestMethod.GET)
	public Employee getEmp3() throws ResourceNotFoundException, EmployeeServiceException {
		try {
			Employee emp = employeeService.getEmployeeException();
			if (emp == null) {
				throw new ResourceNotFoundException("Employee not found");
			}
			return emp;
		} catch (EmployeeServiceException e) {
			throw new EmployeeServiceException("Internal Server Exception while getting exception");
		}
	}
}