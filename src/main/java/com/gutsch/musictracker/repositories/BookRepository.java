package com.gutsch.musictracker.repositories;

import com.gutsch.musictracker.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
