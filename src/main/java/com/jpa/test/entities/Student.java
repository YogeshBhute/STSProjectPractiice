package com.jpa.test.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	private String firstName;
	private String lastName;
	private String city;
	private double contactNo; 
	private Long borrowedBookId; 
}
