package com.gutsch.musictracker.repositories;

import com.gutsch.musictracker.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
