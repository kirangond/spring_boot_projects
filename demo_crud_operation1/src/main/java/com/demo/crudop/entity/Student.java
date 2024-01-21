package com.demo.crudop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity  //it will map class with db table
public class Student {
	
	@Id //indicates the private key for the id in db table 
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //program will automatically add id no need to enter
	private int id;
	private String sname;
	private String scourse;
	private int sfee;
	//generate getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	public int getSfee() {
		return sfee;
	}
	public void setSfee(int sfee) {
		this.sfee = sfee;
	}

	

}
