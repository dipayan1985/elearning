package com.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elearning.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
