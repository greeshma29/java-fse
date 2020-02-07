package com.cts.training.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cts.training.spring.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/dashboard")
	public String home() {
		return "student-home";
	}
	
	@RequestMapping("/profile")
	public String profile(Model model) {
		// blank object of Student (bag)
		Student student = new Student();
		student.setUname("Dummy");
		// add to model to share with view page ( to map with form )
		model.addAttribute("student", student);
		return "student-profile";
	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute Student student) {
		System.out.println("NAME : " + student.getUname());
		System.out.println("EMAIL : " + student.getEmail());
		
		
		
		return "student-confirm";
	}
	
	
}
