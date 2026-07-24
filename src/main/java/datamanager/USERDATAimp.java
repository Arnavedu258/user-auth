package datamanager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class USERDATAimp implements USERDATA {
	public boolean isvalidate(String username, String password) {
		String query="SELECT * FROM LOGIN WHERE USERNAME=? AND PASSWORD=?";
		
		try {
			Connection con=datautil.getConnection();
			
		PreparedStatement pstm=con.prepareStatement(query);
		
		pstm.setString(1,username);
		pstm.setString(2,password);
		
		ResultSet rs=pstm.executeQuery();
		
		return rs.next();
		
			
		}
		catch(SQLException e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
		
		
		
	}
}
