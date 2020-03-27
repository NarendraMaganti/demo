package org.capgemini.jdbc.demo;

import java.sql.*;

public class Test2 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String delqry = "delete from bangalore.student where sid=4";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			stmt = con.createStatement();
			stmt.executeUpdate(delqry);
			System.out.println("All operations successfully ");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		finally {

			if (stmt != null) {
				try {
					stmt.close();
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
