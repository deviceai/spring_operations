package com.example.demo.presentation;

import com.example.demo.businesslayer.Book;
import com.example.demo.businesslayer.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
public class BookController {
    @Autowired BookServiceImpl bookServiceImpl;
    @GetMapping("/")
    public HashSet findAll(){
        return bookServiceImpl.findAllBook();
    }
    @PostMapping("/")
    public void addBook(@RequestBody Book book){
        bookServiceImpl.addBook(book);
    }
    @GetMapping("/findbyid/{id}")
    public Book geBookById(@PathVariable long id) {
        return bookServiceImpl.findBookByID(id);
    }
    @DeleteMapping("/delete")
    public void deleteBook() {
        bookServiceImpl.deleteAllData();
    }
}
