package com.demp.crudo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.crudop.entity.Student;


//while creating interface add CrudRepository so it will be child of that interface 
//<which entity class and wrapper class
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
