package com.java.repository;

import org.springframework.data.repository.CrudRepository;

import com.java.model.Books;


/*
 * Repository class extends CRUDRepository class to implement all the basic CRUD operations
 * Create, Update, Read, Delete
 */
public interface BooksRepository extends CrudRepository<Books, Integer> {
}
