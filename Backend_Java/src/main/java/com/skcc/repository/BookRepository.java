package com.skcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.model.book.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
}
