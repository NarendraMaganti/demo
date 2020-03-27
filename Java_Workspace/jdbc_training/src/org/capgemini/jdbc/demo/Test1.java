package org.capgemini.jdbc.demo;

import java.sql.*;

public class Test1 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String inqry1 = "insert into bangalore.student values(4,'phani',82)";
		String inqry2 = "insert into bangalore.student values(5,'ashok',80)";
		String inqry3 = "insert into bangalore.student values(6,'kamal',90)";
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			System.out.println("load and register the driver class");
			con = DriverManager.getConnection("jdbc:mysql://localhost"
					+ ":3306?user=root&password=root");
			stmt = con.createStatement();
			stmt.executeUpdate(inqry1);
			stmt.executeUpdate(inqry2);
			stmt.executeUpdate(inqry3);
			System.out.println("data's 4 inserted successfully");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

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
