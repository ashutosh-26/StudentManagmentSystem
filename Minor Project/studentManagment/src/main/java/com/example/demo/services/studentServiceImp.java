package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.student;
import com.example.demo.repository.studentRepository;

@Service
public class studentServiceImp implements studentServices {
	studentRepository sp;
	public studentServiceImp(studentRepository sp) {
		this.sp=sp;
	}
	
	@Override
	public String addstudent(student s) {
		sp.save(s);
		
		return  "student added!" ;
	}

	@Override
	public student getstudent(String id) {
		student st=sp.findById(id).get();
		return st;
	}

	@Override
	public List<student> getAllstudent() {
		List<student>sl=sp.findAll();
		return  sl ;
	}

	@Override
	public String updatestudent(student s) {
		sp.save(s);
		return "student update!";
	}

	@Override
	public String deletestudent(String id) {
		sp.deleteById(id);
		return "student deleted!";
	}


}
