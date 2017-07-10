package com.example.demo.controller;

import java.util.Optional;
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pojo.Book;
import com.example.demo.Service.BookService;






@RestController
public class BookController {
	@Autowired  
    private BookService bookService;   
   
	@RequestMapping(method = RequestMethod.GET,value= "/book")  
    public List<Book> getAllBook(){  
        return bookService.getAllBooks(); 
    }     
    
    @RequestMapping(method = RequestMethod.GET,value= "/string_return")
    public String  string_return(){  
        return "hello buji";  
    } 
    
    @RequestMapping(value="/addbook", method=RequestMethod.POST)  
    public void addBook(@RequestBody Book id){  
        bookService.addBook(id);  
    }  
    @RequestMapping(value="/book/{id}", method=RequestMethod.GET)  
    public Optional<Book> getBook(@PathVariable int id){  
        return bookService.getBook(id);  
    } 
   
 }
  

