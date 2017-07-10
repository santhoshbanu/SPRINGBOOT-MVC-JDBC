package com.example.demo.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Pojo.BookDetail;

@Repository
public interface BookDetailRepository extends JpaRepository<BookDetail, Integer> {
	
	void deleteById(long id);

	public  List<BookDetail> findById(int id);
	
}