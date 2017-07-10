import java.sql.Connection;
import java.sql.DriverManager;
public class db{
	public static Connection createConnection()
	{
	Connection con=null;
	String url="jdbc:mysql://localhost:3306/library";
	String username="root";
	String password="root";
	try
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		
	}
	catch(ClassNotFoundException e)
		{            
		e.printStackTrace();
		}
		con=DriverManager.getConnection(url,username,password);
	}
	catch(Exception e)
	{
		e.printStackTrace();	
	}
	return con;
}
}