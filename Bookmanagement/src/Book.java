


public class Book {

	
	String name;
	int price;
	String author;
	String publication;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author= author;
	}
	public String getpublication() {
		return publication;
	}
	public void setpublication(String publication)
	{
		this.publication= publication;
	}
		@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", publication=" + publication + "]";
	}
		public Book(String name, int price, String author,String publication)
	{
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.publication = publication;
	}
	
	public Book(){}
	
	
}
