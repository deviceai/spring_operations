package com.example.demo.businesslayer;

import org.springframework.stereotype.Service;

import java.util.HashSet;
@Service
public class BookServiceImpl implements BookService{

    //Repository
    HashSet<Book> bookList = new HashSet<>();
    @Override
    public HashSet<Book> findAllBook() {
        if (bookList.isEmpty())
            return null;
        else
            return bookList;
    }

    @Override
    public Book findBookByID(long id) {
        Book book = bookList.stream().filter(b ->b.getId() == id).findAny().orElse(null);
        return book;
    }

    @Override
    public void addBook(Book b) {
        bookList.add(b);
}

    @Override
    public void deleteAllData() {
        bookList.clear();
    }
}
