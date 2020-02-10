package com.cts.training.spring.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.training.spring.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	 @RequestMapping("/dashboard")
	    public String home() {
		   return "student-home";
	   }
	 
	 @RequestMapping("/profile")
	 public String profile() {
		 return "student-profile";
	 }
	 
	 @RequestMapping()
	 public String defaultMethod() {
		 return "student-home";
	 }
	 
	/* @RequestMapping("/save")
	 public String saveData() {
		 return "student-confirm";
	 }*/
	 
	/* @RequestMapping("/save") 
		public String saveData(HttpServletRequest request) {
			String uname = request.getParameter("uname");
			String email = request.getParameter("email");
			System.out.println("\nName : " + uname);
			System.out.println("Email : " + email);
			return "student-confirm";
		}*/
	 
	/* @RequestMapping("/save") 
		public String saveData(@RequestParam String uname, @RequestParam String email ) {
			System.out.println("\nName : " + uname);
			System.out.println("Email : " + email);
			return "student-confirm";
		}*/
	 
	/* @RequestMapping("/save") 
	 public String saveData(@RequestParam("uname") String userName, @RequestParam(value = "email", required = false, defaultValue = "dummy@mail.com") String userEmail) {
			System.out.println("\nName : " + userName);
			System.out.println("Email : " + userEmail.toUpperCase());
			return "student-confirm";
		}*/
	 
	 @RequestMapping("/save")
		public String saveData(Student student,Model model) {
			System.out.println("\nName : " + student.getUname());
			System.out.println("Email : " + student.getEmail());
			
			student.setUname(student.getUname().toUpperCase());
			student.setEmail(student.getEmail().toUpperCase());
			model.addAttribute("stud",student);
			return "student-confirm";
		}
	 
	 @RequestMapping("*")
	 public String fallbackMethod() {
		 return "error-page";
	 }
}
