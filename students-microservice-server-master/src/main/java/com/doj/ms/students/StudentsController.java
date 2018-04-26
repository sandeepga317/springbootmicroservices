package com.doj.ms.students;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentsController {

	@RequestMapping("/students")
	public List<Students> all() {
		Students st1=new Students("Sandeep","Karimnagar");
		Students st2=new Students("Test","Hyderabad");
		
		List<Students> students=new ArrayList<>();
		students.add(st1);
		students.add(st2);
		
		return students;
		
		
	}
}
