package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDynamicDelete {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://localhost:3306/cg_db?user=root&password=root";
			con = DriverManager.getConnection(url);
			String query = "DELETE from movie_info where mid=?";			
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(args[0]));
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
