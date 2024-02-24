package com.jpa.test.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.entities.Student;

public interface StudentServices {

	public List<Student> addAllStudents(List<Student> listOfStudents);
	public Student addStudent(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(int studId);
}
