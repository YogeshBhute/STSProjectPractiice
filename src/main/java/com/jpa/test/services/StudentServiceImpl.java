package com.jpa.test.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.jpa.test.dao.StudentRepository;
import com.jpa.test.entities.Student;

@Service
public class StudentServiceImpl implements StudentServices {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> addAllStudents(List<Student> listOfStudents) {
		List<Student> al = new ArrayList<Student>();
		for (Student student : listOfStudents) {
			al.add(student);
		}
		this.studentRepo.saveAll(al);
		return al;
	}

	@Override
	public Student addStudent(Student student) {

		Student stud = this.studentRepo.save(student);
		System.out.println(stud);
		return stud;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> list = (List<Student>) this.studentRepo.findAll();
		return list;
	}

	@Override
	public Student getStudentById(int studId) {
		Student result = this.studentRepo.findById(studId);
		return result;
	}

}
