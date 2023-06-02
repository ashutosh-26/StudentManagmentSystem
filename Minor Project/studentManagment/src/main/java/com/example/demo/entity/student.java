package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class student {
	
	String name;
	@Id
	String id;
	String branch;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String name, String id, String branch) {
		super();
		this.name = name;
		this.id = id;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + ", branch=" + branch + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
