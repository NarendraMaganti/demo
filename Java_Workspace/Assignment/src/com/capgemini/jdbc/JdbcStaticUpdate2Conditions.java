package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStaticUpdate2Conditions {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");			
			String url="jdbc:mysql://localhost:3306/cg_db?user=root&password=root";
			con=DriverManager.getConnection(url);
			String query = "UPDATE movie_info set rating='average' where mid IN (420,400)";
			stmt=con.createStatement();
			int count = stmt.executeUpdate(query);
			System.out.println(count+" rows updated");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(con!=null) {
					con.close();
					}
					if(stmt!=null) {
						stmt.close();
						}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		}



	}

}
