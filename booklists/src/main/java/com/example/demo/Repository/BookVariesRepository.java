package com.example.demo.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Pojo.Book;
import com.example.demo.Pojo.BookVaries;
public interface BookVariesRepository extends JpaRepository<BookVaries, Integer>{
	void deleteById(int id);

	public  List<Book> findById(int id);

}