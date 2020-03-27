package org.capgemini.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test5 {
	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String qry="select * from bangalore.student where sid=1 and sname='saikumar'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			stmt=con.createStatement();
			rs=stmt.executeQuery(qry);
			if(rs.next()) {
				double perc=rs.getDouble("perc");
				System.out.println("Student percentage is"+perc);
			}
			else
			{
				System.out.println("no record found");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
