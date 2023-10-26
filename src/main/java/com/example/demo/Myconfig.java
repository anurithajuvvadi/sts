package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages= {"com.springboot","com.Controller"})
public class Myconfig {
	@Bean("student1")
	@Lazy
	public Student getStudent() {
		System.out.println(" first object student created");
		return new Student("anu");
	}
	@Bean("student2")
	public Student createStudent() {
		System.out.println("second object created");
		return new Student("anuritha");
	}
	

}
