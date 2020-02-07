package com.cts.training.spring.model;

import java.util.LinkedHashMap;

public class Student {
  
	private String uname;
	private String email;
	private String country;
	private String gender;
	private String[] hobbies;

	
	
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
