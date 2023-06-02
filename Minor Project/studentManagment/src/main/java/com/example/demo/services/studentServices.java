package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.student;



public interface studentServices {
	String addstudent(student s);
	student getstudent(String id);
	List<student>getAllstudent();
	String updatestudent(student s);
	String deletestudent(String id);

}


