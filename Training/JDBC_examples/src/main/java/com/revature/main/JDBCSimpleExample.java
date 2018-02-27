/**
 * 
 */
package com.revature.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Nathan
 *
 */
public class JDBCSimpleExample {

	/**
	 * @param args
	 */
	
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadDrivers();
		establishConnection("jdbc:oracle:thin@<endpoint>","Un","Pw");
	}
	
	//load drivers
	static void loadDrivers() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//establish connection
	static void establishConnection(String url, String user, String password) {
		try {
			conn = DriverManager.getConnection(url, user, password); //2
			stmt = conn.createStatement();							//3
			rs = stmt.executeQuery("selsect * from player");			//4 & 5
			while(rs.next()) {
				System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3));
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { //6
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
