package com.example.demo.Pojo;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "book")
@JsonIgnoreProperties
public class Book {
	@Id
	@GeneratedValue
	private int id;
	private String name;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private BookDetail bookDetail;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bookvaries", fetch = FetchType.EAGER)
	
	@JoinColumn(name = "bookvaries_id")
	private BookVaries bookvaries;

	public Book() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BookDetail getBookDetail() {
		return bookDetail;
	}

	public void setBookDetail(BookDetail bookDetail) {
		this.bookDetail = bookDetail;
	}

	@Override
	public String toString() {
		return String.format("Book[id=%d, name='%s', number of pages='%d']", id, name, bookDetail.getNumberOfPages());
	}

	public BookVaries getBookvaries() {
		return bookvaries;
	}

	public void setBookvaries(BookVaries bookvaries) {
		this.bookvaries = bookvaries;
	}
}
