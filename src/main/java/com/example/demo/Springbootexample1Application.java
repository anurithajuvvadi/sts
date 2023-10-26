package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.Learner;

@SpringBootApplication
public class Springbootexample1Application implements CommandLineRunner {
	@Autowired
	@Qualifier("student2")
	private Student student;
	
	@Autowired
	private emp e;
	
	@Autowired
	private Learner learner;

	public static void main(String[] args) {
		
		System.out.println("sprinbootapplication");
		SpringApplication.run(Springbootexample1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
this.student.display();	
this.e.print();
this.learner.studying();

	}

}
