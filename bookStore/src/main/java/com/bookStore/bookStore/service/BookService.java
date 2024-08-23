package com.bookStore.bookStore.service;


import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.respository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bRepo;

    public void save(Book b){
        bRepo.save(b);
    }

    public List<Book> getAllBook(){
        return bRepo.findAll();
    }

    public Book getBookById(int id){
        return bRepo.findAllById(Collections.singleton(id)).get(0);
    }

    public void deleteById(int id){
        bRepo.deleteById(id);
    }

}
