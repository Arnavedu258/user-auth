package registry;
import java.sql.*;
 class registerimp implements registered {
	
	private static final String url="jdbc:mysql://localhost:3306/loginuser";
	private static final String user="root";
	private static final String password="Arnave@1234";
	
	public boolean createclass(String username,String password,String email) {
		
		
		
		String queries="INSERT INTO login(username,password,email) VALUES (?,?,?)";
	
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			try(
			Connection con=getConnection();
			PreparedStatement pstm=con.prepareStatement(queries)){
			
			pstm.setString(1, username);
			pstm.setString(2, password);
			pstm.setString(3, email);

			int afterrow=pstm.executeUpdate();
	if(afterrow > 0) {
		  System.out.println("Inserted Successfully");
	
		return true;
	}
			
			
		}
		}
        catch(ClassNotFoundException e) {
            System.out.println("JDBC Driver Missing");
            e.printStackTrace();
        }
        catch(SQLException e) {

            System.out.println("SQL ERROR");
            e.printStackTrace();
        }
		return false;
	}
	
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,password);
		
		
	}
}
