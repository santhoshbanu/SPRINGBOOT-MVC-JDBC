package com.example.demo.Pojo;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bookvariety")
public class BookVaries {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String author;
	@Column
	private String type;
	@Column
	private String color;

	@ManyToOne(cascade = CascadeType.ALL)
	private List<Book> bookvaries_id;

	public BookVaries() {

	}

	public BookVaries(String author, String type, String color) {
		this.author = author;
		this.type = type;
		this.color = color;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Book> getBookvaries_id() {
		return bookvaries_id;
	}

	public void setBookvaries_id(List<Book> bookvaries_id) {
		this.bookvaries_id = bookvaries_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
