import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class JdbcMysqlConnection {
	
	public static void main(String args[])throws Exception{  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/jdbc","root","admin");  
	  
	//here sonoo is database name, root is username and password  
	PreparedStatement pstmt=con.prepareStatement("insert into myemp1 values(?,?,?)");

	 pstmt.setInt(1,2);
	 pstmt.setString(2, "employee1");
   
	 FileInputStream f=new java.io.FileInputStream(new File("d:/image001.jpg"));
	pstmt.setBinaryStream(3,f);
	 pstmt.execute();
	System.out.println("connected");

	
	
	
	/* Statement stmt=con.createStatement();
	 ResultSet rs=stmt.executeQuery("select * from myemp1");  

	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); */ 
	  
	con.close();  
	  
	}catch(Exception e){ System.out.println(e);}  
	  
	}  
	}  
