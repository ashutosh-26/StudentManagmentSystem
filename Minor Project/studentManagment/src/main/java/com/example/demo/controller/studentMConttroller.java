package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.student;
import com.example.demo.services.studentServices;


@Controller

public class studentMConttroller {
	studentServices ss;
	
	public studentMConttroller(studentServices ss) {
		super();
		this.ss=ss;
		
	}


	@GetMapping("/index.html")
	public String mapindex() {
		return "index";
		
	}
	
	
	@GetMapping("/viewInfo.html")
	public String mapviewInfo() {
		return "viewInfo";
		
	}
	
	@GetMapping("/register.html")
	public String mapregister() {
		return "register";
		
	}
	
	@GetMapping("/remove.html")
	public String mapremove() {
		return "remove";
		
	}
	@GetMapping("/update.html")
	public String mapupdate() {
		return "update";
		
	}
	
	@GetMapping("/showInfo.html")
	public String mapshowInfo() {
		return "showInfo";
		
	}
	
	
//	takeing data
	
	public List<student>getAllStudents(Model model){
		List<student>sl=ss.getAllstudent();
		model.addAttribute("list",sl);
		
		return sl;
		
	}
	
	
	
	
	
	@PostMapping("/addstu")
	public String addstudent(@RequestParam("name") String name,@RequestParam("id") String id,@RequestParam("branch") String branch) {
		student s =new student(name,id,branch);
		ss.addstudent(s);
		
				return "redirect:/";
		
	}
	@PutMapping("/updstu")
	public String updatestudent(@RequestParam("name") String name,@RequestParam("id") String id,@RequestParam("branch") String branch) {
		student st = ss.getstudent(id);
		
		st.setName(name);
		st.setId(id);
		st.setBranch(branch);
		ss.updatestudent(st);
		
				return "redirect:/";
	
	}
	
	@GetMapping("/getstud")
	public String getstudent(@RequestParam("id") String id, Model model) {
		student st=ss.getstudent(id);
		model.addAttribute("student",st);
		return "showInfo";
		
	}
	
	@DeleteMapping("/delstud")
	public String deletestudent(@RequestParam("id") String id) {
		ss.deletestudent(id);
		return "redirect:/";
		
	}
	
	
	
		

}
