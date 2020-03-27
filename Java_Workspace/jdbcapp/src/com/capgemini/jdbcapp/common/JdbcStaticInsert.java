package com.capgemini.jdbcapp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStaticInsert {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url="jdbc:mysql://localhost:3306/cg_db?user=root&password=root";
			con=DriverManager.getConnection(url);
			String query="insert into movie_info values(479,'maari','good')";
			stmt=con.createStatement();
			int count = stmt.executeUpdate(query);
			System.out.println(count+" rows affected");
			
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
