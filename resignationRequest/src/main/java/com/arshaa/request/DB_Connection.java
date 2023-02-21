package com.arshaa.request;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {

	private static String DB_URL = "jdbc:mysql://localhost:3306/resignationrequest";
	private static String DB_USERNAME = "root";
	private static String DB_PASSWORD = "Sriveda5*";
	private static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

	public static Connection getConnection() {
		Connection connection = null;
//		try {
//			Class.forName(DB_DRIVER);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		try {
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
