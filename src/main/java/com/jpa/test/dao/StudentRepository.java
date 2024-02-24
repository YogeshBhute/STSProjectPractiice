package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	public Student findById(int studentId);

}
