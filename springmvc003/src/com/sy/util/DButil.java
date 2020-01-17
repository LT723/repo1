package com.sy.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String url="jdbc:mysql:///18080";
	private static final String user="root";
	private static final String pwd="root";
	private static Connection conn=null;
	public static Connection getConnection() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, pwd);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
