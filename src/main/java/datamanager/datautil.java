package datamanager;

import java.sql.*;
import java.sql.SQLException;

public class datautil {
	private static final String url="jdbc:mysql://localhost:3306/loginuser";
	private static final String user="root";
	private static final String password="Arnave@1234";
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
	}

	public static Connection getConnection() throws SQLException{
		
		// TODO Auto-generated method stub
		System.out.println("create database ");
		return DriverManager.getConnection(url,user,password);
	}
}
