package com.capgemini.jdbcapp.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.mysql.jdbc.Driver;

public class MyFirstJdbc {

	public static void main(String[] args) {

//		Connection con=null;
//		Statement stmt=null;
//		ResultSet rs=null;
//		try {
//			//1.Load the driver
//			//		Driver driver = new Driver();
//			//			DriverManager.registerDriver(driver);
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			//2.establish the connection via driver
//			//String dburl="jdbc:mysql://localhost:3306/cg_db?user=root&password=root";
//			//con = DriverManager.getConnection(dburl);
//			//second overloaded method of getconnection
//			String dburl="jdbc:mysql://localhost:3306/cg_db?user=root&password=root";
//			//con =DriverManager.getConnection;
//			//3.issue the sql query via connection
//			String query = "select * from movie_info";
//			stmt = con.createStatement();
//			//4.process the result returned by sql query
//			rs=stmt.executeQuery(query);
//
//			while(rs.next()) {
//
//				int mid=rs.getInt("mid");
//				String movieName = rs.getString("mname");
//				String movieRating= rs.getString("rating");
//				System.out.println("movie id is : "+mid);
//				System.out.println("movie name is :"+movieName);
//				System.out.println("rating of that movie is: "+movieRating);
//				System.out.println("------------------------");
//
//			}
//
//
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			//5.close all jdbc objects
//
//			try {
//				if(con!=null) {
//					con.close();
//				}
//				if(stmt!=null) {
//					stmt.close();
//				}
//				if(rs!=null) {
//					rs.close();
//				}
//
//
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String url = "jdbc:mysql://localhost:3306/onlinemedicalstore?user=root&password=root";
			con = DriverManager.getConnection(url);
			String query = "select * from product";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String itemCode = rs.getString("itemCode");
				String categoryType = rs.getString("categoryType");
				String itemName = rs.getString("itemName");
				Double price = rs.getDouble("price");
				Date manufacturingDate = rs.getDate("manufacturingDate");
				Date expireDate = rs.getDate("expireDate");
				int stock = rs.getInt("stock");
			    System.out.println(itemCode);
			    System.out.println(categoryType);
			    System.out.println(itemName);
			    System.out.println(price);
			    System.out.println(manufacturingDate);
			    System.out.println(expireDate);
			    System.out.println(stock);
			    System.out.println("============================================");
			}
		} catch (Exception e) {
			e.getMessage();
		}
		



	}//main method end

}//class end
