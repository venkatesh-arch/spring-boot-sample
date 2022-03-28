package org.learning.controller;

import java.util.List;

import org.learning.model.BookModel;
import org.learning.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1")
public class BookController {
	
@Autowired
private BookRepository bookRepository;

@GetMapping(value="/books")
public List<BookModel> getAllBooks(){
	System.out.println("In getAll request");
	return bookRepository.findAll();
}
}
