package org.capgemini.jdbc.demo;

import java.sql.*;

public class Test10 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String uqry = "update student1 set sid=? where sname=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bangalore?user=root&password=root";
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement(uqry);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			int c = pstmt.executeUpdate();
			System.out.println("No of records affected in the database " + c);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

	}
}
