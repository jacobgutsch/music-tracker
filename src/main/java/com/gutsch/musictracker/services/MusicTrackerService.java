package com.gutsch.musictracker.services;

import com.gutsch.musictracker.entities.Book;
import com.gutsch.musictracker.repositories.BookRepository;
import com.gutsch.musictracker.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MusicTrackerService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private SongRepository songRepository;

    public List<Book> getAllBooks() {
//        return bookRepository.findAll();
        Book book = new Book();
        book.setBookId(1);
        book.setBookName("Test Name");
        return Collections.singletonList(book);
    }
}
