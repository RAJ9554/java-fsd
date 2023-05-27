package com.simpli;

import java.sql.*;

public class DBUtil {

	Connection connection;

	public DBUtil(String dbURL, String user, String pwd) {

		try {
			// step 1 : Loading the JDBC driver class;
			Class.forName("com.mysql.jdbc.Driver");

			// step 2 : Use the Driver Manager to get a connection to the database;
			this.connection = DriverManager.getConnection(dbURL, user, pwd);
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public Connection getConnection() {
		return this.connection;
	}

	public void closeConnection() throws SQLException {
		if (this.connection != null)
			this.connection.close();
	}

}