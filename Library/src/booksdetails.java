import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class booksdetails {
	
	String name;
	int price;
	String author;
	String publication;
	Scanner scan = new Scanner(System.in);
	int choice;
	List<Book> bookList = new ArrayList<Book>();
	 public void InsertMethod()throws SQLException
	    {
		 Connection con =db.createConnection();
		 PreparedStatement ps =con.prepareStatement("insert into booklist(name,author,price,publication) values(?,?,?,?)");
		 Book book =new Book();
		
		 System.out.println("Enter book name: ");
		 name=scan.next();		 
		 book.setName(name);	 
		 ps.setString(1,book.getName());
		 
		 System.out.println("enter the author");
		 author =scan.next();
		 book.setauthor(author);
		 ps.setString(2,book.getauthor());
		 
		 System.out.println("enter the price");
		 price=scan.nextInt();
		 book.setprice(price);
		 ps.setInt(3,book.getprice());
		 System.out.println("enter the publication");
		 publication =scan.next();
		 book.setpublication(publication);
		 ps.setString(4,book.getpublication()); 
	     bookList.add(book);
	     int i=ps.executeUpdate();
	     con.close();
	    }
	 public void UpdateMethod()throws SQLException
     {
		 Connection con=db.createConnection();
		 PreparedStatement ps =con.prepareStatement("Update booklist set author=?, price=?,publication=? where name=?");
   System.out.println("Enter name to whom you want to Update from list" +bookList);
     name=scan.next();
    ListIterator<Book> ti = bookList.listIterator(); 
    
     System.out.println("Enter new author");
     String newauthor = scan.next();
     System.out.println("Enter new price");
     int newprice=scan.nextInt();
     System.out.println("Enter new publication");
     String newpublication = scan.next();
     while(ti.hasNext())
       {  
        Book book = ti.next();
       
           if(book.getName().equals(name)) 
                       
           {
            
            book.setauthor(newauthor);
            ps.setString(2,book.getauthor());
            book.setprice(newprice);
            ps.setInt(3,book.getprice());
            book.setpublication(newpublication);
            ps.setString(4,book.getpublication());
         }
           
           ti.remove();
           ti.add(book);
       }
             }
	 public void DeleteMethod() throws SQLException
	    {
		 Connection con=db.createConnection();
	    PreparedStatement ps=con.prepareStatement("delete from booklist where name=?");
	    Book book =new Book();
	        System.out.println("Enter Book NAME  whose record you want to Delete: ");
	     name =scan.next();
	     Iterator<Book> iter=bookList.iterator();
	    while(iter.hasNext()){
	    	if(iter.next().getName().equals(name))
	    	{
	    		iter.remove();
	        ps.setString(1,book.getName());
	        System.out.println("the booksdetails"+name+"detail is deleted");
	    }
	    		}
	    int i=ps.executeUpdate();
	    
}
	 
	public void Displaymethod()throws SQLException
	 {
		Connection con=db.createConnection();
		PreparedStatement ps=con.prepareStatement("select * from booklistss");
		 System.out.println(bookList.toString().toString());
	 }
}
