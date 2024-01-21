package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.crudop.entity.Student;
import com.demp.crudo.repositories.StudentRepository;

@SpringBootTest
class DemoCrudOperation1ApplicationTests {
	
	@Autowired //it will create object of the class 
	StudentRepository studentRepo;

	@Test
	void insertStudentRecords() {
	//we should not create object in this avoid it.	
		Student student = new Student();
		student.setSname("pavan");
		student.setScourse("spring");
		student.setSfee(20000);
		studentRepo.save(student);
		
	}

}
