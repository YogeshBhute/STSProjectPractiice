package com.jpa.test.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	private int bookId;
	private String bookName;
	private String bookAuther;
	private int bookPrice;
}
