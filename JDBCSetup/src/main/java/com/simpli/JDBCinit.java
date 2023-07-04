package com.simpli;

import java.io.*;
import java.sql.*;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/init")
public class JDBCinit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 PrintWriter out = response.getWriter();
         out.println("<html><body>");
         
         // Load the DB properties from the config file
         InputStream in = getServletContext().getResourceAsStream("config.properties");
         
         Properties props = new Properties();
         props.load(in);
         
         DBUtil dbutil = new DBUtil(props.getProperty("url"),
        		 props.getProperty("userid"), props.getProperty("password"));
         
         Connection connection = dbutil.getConnection();
         out.println("DB Connection initialized successfully!.<br>");
         
//         //dbutil.closeConnection();
//         out.println("DB Connection closed.<br>");
         out.println("</body></html>");

	}
}
