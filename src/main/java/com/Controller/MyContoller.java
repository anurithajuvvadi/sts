package com.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Student;

@Controller
public class MyContoller {
	@Autowired
	@Qualifier("student2")
	private Student student;
	@RequestMapping(value="/home",method=RequestMethod.GET)
	@ResponseBody
	public Student home() {
		 System.out.println("this is home method");
		 return this.student;
		
	}
	

}
