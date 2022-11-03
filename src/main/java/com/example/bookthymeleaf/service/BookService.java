package com.example.bookthymeleaf.service;

import com.example.bookthymeleaf.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {


    List<Book> findAll();
    void saveAll(List<Book> books);
}
