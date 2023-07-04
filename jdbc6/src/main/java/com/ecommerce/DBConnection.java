package com.ecommerce;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

        private Connection connection;
        
        public DBConnection(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{
                
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