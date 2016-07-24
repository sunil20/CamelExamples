import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class ReadBlobObjectFromMysqlDb {
	
	public static void main(String args[])throws Exception{  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");  
	  
	Statement stmt=con.createStatement();
	 ResultSet rs=stmt.executeQuery("select * from myemp1"); 
	 System.out.println("reultset size::"+rs);
	 
	
	 rs.next();
	 
	 InputStream is=rs.getBinaryStream(3);	 
	FileOutputStream fos=new FileOutputStream("d:/vir.jpg");
	  int i=is.read();
	  while(i!=-1){
		  fos.write(i);
		  i=is.read();
	  }
	 
	System.out.println("connected");
	con.close();  
	  
	}catch(Exception e){ System.out.println(e);}  
	  
	}  
	}  
