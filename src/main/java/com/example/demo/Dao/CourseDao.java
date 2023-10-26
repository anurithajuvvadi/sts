package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Course;

public interface CourseDao extends JpaRepository<Course,Long>{
public List<Course> findByTitle(String s);
public List<Course> findByTitleStartingWith(String s);
public List<Course> findByTitleAndDescription(String s1,String s2);

@Query(value="select c from Course c order by c.title desc")
public List<Course> findByAll();

@Query(value="select c from Course c where c.title like 'j%'")
public List<Course> findByLikeExample();


@Query(value="select c from Course c where c.title =:n")
public List<Course> getCourseByTitle(@Param("n") String title);

}
