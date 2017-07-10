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
	Book book =new Book();
	 public void InsertMethod()
	    {
		 Book book =new Book();
		 System.out.println("Enter book name: ");
		 name=scan.next();		 
		 book.setName(name);	 
		 System.out.println("enter the author");
		 author =scan.next();
		 book.setauthor(author);
		 System.out.println("enter the price");
		 price=scan.nextInt();
		 book.setprice(price);
		 System.out.println("enter the publication");
		 publication =scan.next();
		 book.setpublication(publication);
	     bookList.add(book);
	    }
	 public void UpdateMethod()
     {
   System.out.println("Enter name to whom you want to Update from list"+bookList);
  
    ListIterator<Book> ti = bookList.listIterator(); 
    name=scan.next();
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
            book.setprice(newprice);
            book.setpublication(newpublication);
         }
           
           ti.remove();
           ti.add(book);
       }
             for (Book tii:bookList)
       {
           
       }
             }
	 public void DeleteMethod()
	    {
	        System.out.println("Enter Book NAME  whose record you want to Delete: ");
	     name =scan.next();
	     Iterator<Book> iter=bookList.iterator();
	    while(iter.hasNext()){
	    	if(iter.next().getName().equals(name))
	    	{
	    		
	        iter.remove();
	    }
	    		}
	    }
	 public void Displaymethod()
	 {
		 System.out.println(bookList.toString().toString());
	 }
}
