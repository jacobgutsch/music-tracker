package com.gutsch.musictracker.controllers;

import com.gutsch.musictracker.entities.Book;
import com.gutsch.musictracker.services.MusicTrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MusicTrackerController {

    @Autowired
    private MusicTrackerService musicTrackerService;

    @GetMapping(value = "/all")
    public List<Book> getAllBooks() {
        return musicTrackerService.getAllBooks();
    }
}
