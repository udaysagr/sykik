package com.htc.bookServices.dao;

import org.springframework.data.repository.CrudRepository;

import com.htc.bookServices.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	 
}
