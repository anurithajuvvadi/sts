package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.Courseservice;

@RestController
public class MyController {
	@Autowired
	private Courseservice cservice;
	
	
	@GetMapping("/home")
	public String home() {
		return "this is my first page";
	}
	
	//get list of all courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.cservice.getCourses();
	}
	
	//get single course by id
	@GetMapping("courses/{courseId}")
	public Course getCourseById(@PathVariable String courseId) {
		return this.cservice.getCourseById(Long.parseLong(courseId));
		
	}
	//adding a new course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course c) {
		return this.cservice.addCourse(c);
		
	}
	//updating course using put mapping
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course c) {
		return this.cservice.updateCourse(c);
		
	}
	//deleting course
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
		this.cservice.deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
		
		}catch(Exception e ) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/courses/{title}")
	public List<Course> findByTitle(@PathVariable String title){ 
		return this.cservice.findByTitle(title);
		
	}
	@GetMapping("/courses/titleby/{titleby}")
	public List<Course> findByTitleStartingWith(@PathVariable String titleby){
		return this.cservice.findByTitleStartingWith(titleby);
	}

	@GetMapping("/courses/titleanddesc/{titleby},{description}")
	public List<Course> findByTitleAndDescription(@PathVariable String titleby,@PathVariable String description){
		return this.cservice.findByTitleAndDescription(titleby,description);
	}
	@GetMapping("/courses/Query")
	public List<Course> findByAll(){
		return this.cservice.findByAll();
	}
	
	@GetMapping("/courses/Query1")
	public List<Course> findByLikeExample(){
		return this.cservice.findByLikeExample();
	}
	
	@GetMapping("/courses/Query2/{title}")
	public List<Course> getCourseByTitle(@PathVariable String title){
		return this.cservice.getCourseByTitle(title);
	}
	
	

}
