package com.capgemini.my_properties.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJdbcProperty {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			//1.Load the driver
			//			Driver driver = new Driver();
			//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			/*2.establish the connection via driver
			String dburl="jdbc:mysql://localhost:3306/cg_db?user=root&password=root";
			con = DriverManager.getConnection(dburl);
			second overloaded method of getconnection*/
			String dburl="jdbc:mysql://localhost:3306/cg_db";
			FileInputStream input = new FileInputStream("db.properties");
			Properties pro = new Properties();
			pro.load(input);
			con =DriverManager.getConnection(dburl, pro);
					//3.issue the sql query via connection
					String query = "select * from movie_info";
			stmt = con.createStatement();
			//4.process the result returned by sql query
			rs=stmt.executeQuery(query);

			while(rs.next()) {

				int mid=rs.getInt("mid");
				String movieName = rs.getString("mname");
				String movieRating= rs.getString("rating");
				System.out.println("movie id is : "+mid);
				System.out.println("movie name is :"+movieName);
				System.out.println("rating of that movie is: "+movieRating);
				System.out.println("------------------------");

			}



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//5.close all jdbc objects

			try {
				if(con!=null) {
					con.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}


			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}


	}

}
