package com.example.demo.Service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Pojo.Book;
import com.example.demo.Repository.BookRepository;
@Service
public class BookService {
@Autowired
private BookRepository bookRepository;
public List<Book> getAllBooks(){  
    List<Book>bookRecords = new ArrayList<>();  
    bookRepository.findAll().forEach(bookRecords::add);  
    return bookRecords;  
    } 

public Optional<Book> getBook(int id){  
    return bookRepository.findById(id); 
}  
public void addBook(Book book){  
	bookRepository.save(book);  
}  

public void delete(int id){  
	bookRepository.deleteById(id); 
	}


}  

