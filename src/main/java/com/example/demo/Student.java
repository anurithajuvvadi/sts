package com.example.demo;

public class Student {
	String name;
	


	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("this is display method");
	}
	

}
