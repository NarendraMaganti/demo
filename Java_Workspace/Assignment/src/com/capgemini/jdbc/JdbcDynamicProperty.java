package com.capgemini.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcDynamicProperty {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			FileInputStream input = new FileInputStream("db.properties");
			Properties pro = new Properties();
			pro.load(input);
			String url = "jdbc:mysql://localhost:3306/cg_db?user=root&password=root";
			con = DriverManager.getConnection(url, pro);
			String query = "INSERT into movie_info values(?,?,?)";			
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setString(3, args[2]);	
			int count = pstmt.executeUpdate();
			System.out.println(count+" rows updated");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
