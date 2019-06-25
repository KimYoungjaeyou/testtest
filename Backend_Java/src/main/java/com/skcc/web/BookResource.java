package com.skcc.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.model.book.Book;
import com.skcc.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@RequestMapping("/book")
@RestController
@RequiredArgsConstructor
public class BookResource {

	
	 private final BookRepository bookRepository;
	 
	    @GetMapping
	    public List<Book> showResourcesVetList() {
	        return bookRepository.findAll();
	    }
}
