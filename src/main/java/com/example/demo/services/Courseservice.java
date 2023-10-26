package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;

public interface Courseservice {
	public List<Course> getCourses();

	public Course getCourseById(long courseId);

	public Course addCourse(Course c);

	public Course updateCourse(Course c);

	public void deleteCourse(long parseLong);
	
	public List<Course> findByTitle(String s);
	
	public List<Course> findByTitleStartingWith(String s);
	
	public List<Course> findByTitleAndDescription(String s1,String s2);

	public List<Course> findByAll();
	
	public List<Course> findByLikeExample();

	public List<Course> getCourseByTitle(String title);



}
