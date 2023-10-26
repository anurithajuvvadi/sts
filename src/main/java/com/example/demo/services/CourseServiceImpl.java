package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.CourseDao;
import com.example.demo.entities.Course;

@Service
public class CourseServiceImpl implements Courseservice{

    @Autowired
	private CourseDao cdao;
	//List <Course> list;
	public CourseServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Course(123,"Java","basic core java course"));
//		list.add(new Course(456,"DBMS","basic dbms course"));

	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		//return list;
		return cdao.findAll();
	}
	@Override
	public Course getCourseById(long courseId) {
		return cdao.findById(courseId).get();
		// TODO Auto-generated method stub
//	Course c=null;
//	for(Course course:list) {
//		if(course.getId()== courseId ) {
//			c=course;
//			break;
//		}
//	
//	}
//return c;
	}
	@Override
	public Course addCourse(Course c) {
//		list.add(c);
		cdao.save(c);
		return c;
	}
	@Override
	public Course updateCourse(Course c) {
		cdao.save(c);
//		list.forEach(e->{
//			if(e.getId()==c.getId()) {
//				e.setTitle(c.getTitle());
//				e.setDescription(c.getDescription());
//			}
//		});
		return c;
	}
	public void deleteCourse(long parseLong) {
		Course entity=cdao.getOne(parseLong);
		cdao.delete(entity);
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}
	public List<Course> findByTitle(String s)
	{
		List<Course> c1=cdao.findByTitle(s);
		c1.forEach(e->System.out.println(e));
		return c1;
		
		}
	public List<Course> findByTitleStartingWith(String s)
	{
		List<Course> c1=cdao.findByTitleStartingWith(s);
		c1.forEach(e->System.out.println(e));
		return c1;
		
		}
	public List<Course> findByTitleAndDescription(String s1,String s2)
	{
		List<Course> c1=cdao.findByTitleAndDescription(s1,s2);
		c1.forEach(e->System.out.println(e));
		return c1;
		
		}
	public List<Course> findByAll(){
		List<Course> c1=cdao.findAll();
		c1.forEach(e->System.out.println(e));
		return c1;
		
		
	}
	
	public List<Course> findByLikeExample(){
		List<Course> c1=cdao.findAll();
		c1.forEach(e->System.out.println(e));
		return c1;
		
	}
	public List<Course> getCourseByTitle(String title){
		List<Course> c1=cdao.getCourseByTitle(title);
		c1.forEach(e->System.out.println(e));
		return c1;

	}
	
	}


