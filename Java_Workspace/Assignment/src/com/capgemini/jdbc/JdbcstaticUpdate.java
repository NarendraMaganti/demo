package com.capgemini.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcstaticUpdate {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			FileInputStream input = new FileInputStream("db.properties");
			Properties pro = new Properties();
			pro.load(input);
			String url = pro.getProperty("url");
			
			con=DriverManager.getConnection(url, pro);
			String query = "UPDATE movie_info set rating='average' where mid=746";
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
