package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class CourseFee {
	@Id
	private int cid;
	private String ctype;
	private int cfees;
	
	@OneToOne(mappedBy = "cf")
	@JsonBackReference
	private Course course;

	public CourseFee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseFee(int cid, String ctype, int cfees, Course course) {
		super();
		this.cid = cid;
		this.ctype = ctype;
		this.cfees = cfees;
		this.course = course;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public int getCfees() {
		return cfees;
	}

	public void setCfees(int cfees) {
		this.cfees = cfees;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "CourseFee [cid=" + cid + ", ctype=" + ctype + ", cfees=" + cfees + ", course=" + course + "]";
	}
	
	
	

}
