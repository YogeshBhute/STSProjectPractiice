package com.jpa.test.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jpa.test.entities.Student;
import com.jpa.test.services.StudentServices;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class StudentController {

	@Autowired
	private StudentServices studentService;

	@PostMapping(value = "/addAllStudents")
	public List addAllStudentsToDatabase(@RequestBody List<Student> studentList) {
		List<Student> list = this.studentService.addAllStudents(studentList);
		System.out.println(list);
		return list;
	}

	@PostMapping(value = "/addStudent")
	public Student addOneStudent(@RequestBody Student stud) {
		Student result = this.studentService.addStudent(stud);
		return result;
	}

	@GetMapping(value = "/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudentsFromDatabase() {
		List<Student> list = this.studentService.getAllStudents();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		}
		return ResponseEntity.of(Optional.of(list));
	}

	@GetMapping(value = "/getbyid/{id}")
	public ResponseEntity<Student> getStudentByIdFromDatabase(@PathVariable("id") int studid) {
		Student stud = this.studentService.getStudentById(studid);
		if (stud == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.ofNullable(stud));
	}

}
