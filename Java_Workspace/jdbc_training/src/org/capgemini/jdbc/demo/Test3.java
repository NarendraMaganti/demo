package org.capgemini.jdbc.demo;

import java.sql.*;

public class Test3 {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs=null;
		String sqry= "select * from bangalore.student";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			stmt = con.createStatement();
			rs=stmt.executeQuery(sqry);
			while(rs.next()) {
				int i=rs.getInt(1);
				String name=rs.getString(2);
				double perc=rs.getDouble(3);
				System.out.println(i+" "+name+" "+perc);
				System.out.println("-----------------------------");
				
			}
			System.out.println("All operations successfully ");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}


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
