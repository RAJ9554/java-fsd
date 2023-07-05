package com.simpli;

//package com.simpli;

import java.io.*;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.hibernate.*;

import com.ecommerce.EProduct;

@WebServlet("/query-demo")
public class HibernateQueryDemo extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// STEP 1: Get a Session (connection) from the Session Factory class
		SessionFactory factory = HibernateUtil.getSessionFactory();

		// STE2 Create the session object
		Session session = factory.openSession();

		out.println("Hibernate Session opened.<br>");

		// STEP 3 Query the DB and get the data
		List<EProduct> eproducts = session.createQuery("from EProduct").list();
		out.println("<table border=1>");
		for (EProduct prod : eproducts) {
			out.println("<tr>" + "<td>" + prod.getID() + "<td>" + prod.getName() + "<td>" + prod.getPrice() + "<td>"
					+ prod.getDateAdded());
		}
		out.println("</table>");

		session.close();

		out.println("Hibernate Session closed.<br>");

		out.println("</body></html>");
	}

}