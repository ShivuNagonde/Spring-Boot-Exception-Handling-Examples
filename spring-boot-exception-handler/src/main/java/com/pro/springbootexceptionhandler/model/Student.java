package com.pro.springbootexceptionhandler.model;

import java.io.Serializable;

public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String id;
	private String firstname;
	private String lastname;
	private String age;
	
	public Student(String id, String firstname, String lastname, String age) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
