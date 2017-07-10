import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class bookmenu {
      public static void main(String[] args)  
        {
		Scanner scan = new Scanner(System.in);
		int choice;
		List<Book> booksList = new ArrayList<Book>();
		Book Book =new Book();
		booksdetails c=new booksdetails();
		do
		{
		System.out.println("library menu");
		System.out.println("Select a choice:");	  
		System.out.println("1. Insert");	    
		System.out.println("2. Display");   	  
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println("5. Exit");
		choice=scan.nextInt();
		
		switch(choice)
		{		
		case 1:
		{
			c.InsertMethod();
			break;
		}		 
		case 2:	
		{
			c.Displaymethod();
			break;
		}
		case 3:
		{
			c.UpdateMethod();
			break;
			
		}
		case 4:
		{
		    c.DeleteMethod();
		    break;
		    
		}
		case 5:
        {
            System.exit(0);
        }
			 
		 }
		 }while(choice!=5);
	}
	}
