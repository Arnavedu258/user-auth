
import java.sql.*;
import java.util.*;
public class AdminportImp implements Adminport {
	
	private static final String url="jdbc:mysql://localhost:3306/loginuser";
	private static final String username="root";
	private static final String password="Arnave@1234";
	


	public boolean isvalid(Admindetail admins) {
		
		String query="INSERT INTO login(username,password,email,Adminid) VALUES (?,?,?,?)";
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
		
	try(
			
			Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement prepared=con.prepareStatement(query);
		){
		
		prepared.setString(1,admins.getname());
		prepared.setString(2,admins.getpassword());
		prepared.setString(3,admins.getemail());
		prepared.setString(4,admins.getadmin());
		
		
		int resultant=prepared.executeUpdate();
		
		
		return resultant>0;
		
	}
	
		}
		
	catch(ClassNotFoundException e) {
        e.printStackTrace();
		System.out.println("jdbc missing");
	}
		
        catch(SQLException e) {

            System.out.println("SQL ERROR");
            e.printStackTrace();
        
        }
		return false;
		
		
	}
}
