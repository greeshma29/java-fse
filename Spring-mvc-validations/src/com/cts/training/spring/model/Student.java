package com.cts.training.spring.model;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;

import com.cts.training.spring.web.validators.CourseCode;

public class Student {
  
	//@NotBlank(message="name is required")
	@NotNull(message="name is required")
	private String uname;
	private String email;
	private String country;
	private String gender;
	private String[] hobbies;
	
	@NotNull(message="free passes required")
	@Max(value = 10, message = "max 10 free passes valid")
	@Min(value = 1, message = "atleast 1 free pass is mandatory")
	private Integer freePasses;
	
	@CourseCode()
	private String courseCode;
    
	
	
	public Student() {
		this.countries = new LinkedHashMap<String, String>();
		this.countries.put("FR","FRANCE");
		this.countries.put("IN","INDIA");
		this.countries.put("GR","GERMANY");
		this.countries.put("US","USA");
		
	}
	
	
	private LinkedHashMap<String ,String> countries;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		/*if(this.email == null)
			return "dummy@mail.com";*/
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		if(this.email == null)
			this.email = "dummy@mail.com";
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	 
	public LinkedHashMap<String, String> getCountries(){
		return countries;
	}
	
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	
}
