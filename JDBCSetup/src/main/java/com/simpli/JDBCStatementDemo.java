package com.simpli;

import java.io.*;
import java.sql.*;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/statement-demo")
public class JDBCStatementDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection = null;

	@Override
	public void init() throws ServletException {
		super.init();
		// Load the DB properties from the config file
		InputStream in = getServletContext().getResourceAsStream("config.properties");

		Properties props = new Properties();
		try {
			props.load(in);
		} catch (IOException e) {
			System.out.println(e);
		}

		DBUtil dbutil = new DBUtil(props.getProperty("url"), props.getProperty("userid"),
				props.getProperty("password"));

		connection = dbutil.getConnection();
		System.out.println("DB Connection initialized successfully!.<br>");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		try {
			// Step 3: create the statement
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			// Step 4: Get the results (row data) from server
			ResultSet rs = stmt.executeQuery("SELECT * from eproduct");

			out.println("eproduct Table data<br>");
			while (rs.next()) {
				String ID = rs.getString("ID");
				String name = rs.getString("name");
				float price = rs.getFloat("price");
				String date_added = rs.getString("date_added");

				out.println(ID + ", " + name + ", " + price + ", " + date_added + "<br>");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		// Demo inserting new row
				try {
					Statement stmt2 = connection.createStatement();
					int count = stmt2.executeUpdate("INSERT INTO eproduct(name,price) values('Phillips Mixer', 2000.60);");
					out.println("Added " + count + " row");
				} catch (SQLException e) {
                      e.printStackTrace();
				}
		
		out.println("</body></html>");
	}
	
	@Override
	public void destroy() {		
		super.destroy();
		try {
			connection.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}

}