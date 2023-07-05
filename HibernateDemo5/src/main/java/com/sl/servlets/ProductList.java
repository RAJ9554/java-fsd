package com.sl.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ecommerce.Color;
import com.ecommerce.EProduct;
import com.ecommerce.Finance;
import com.ecommerce.OS;
import com.ecommerce.ScreenSize;
import com.sl.util.HBUtil;

@WebServlet("/product-list")
public class ProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Get the Writer object
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		// Get the SessionFactory object and the Session 

		try {
		SessionFactory sessionFactory = HBUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		//Business Logic
		List<EProduct> products = session.createQuery("from EProduct").list();
		
		for(EProduct p: products) {
			
			 out.println("ID: " + String.valueOf(p.getID()) +
					 ", Name: " +  p.getName() + 
					 ", Price: " + String.valueOf(p.getPrice()) +
					 ", Date Added: " + p.getDateAdded().toString() + "<br>");
			 
			 
			List<Color> colors = p.getColors();
			for(Color c : colors) {
				out.println("Available in colors " + c.getName() + "<br>");
			}
			
			
		
		
            Collection<ScreenSize> sizes= p.getScreenSizes();
            out.println(", Screen Sizes: ");
            for(ScreenSize s: sizes) {
                    out.print(s.getSize() + "&nbsp;");
            }
            
            Set<OS> os= p.getOs();
            out.println(", OS : ");
            for(OS o: os) {
                    out.print(o.getName() + "&nbsp;");
            }
            
            Map finances = p.getFinance();
            out.println(", Finance Options: ");
            if (finances.get("CREDITCARD") != null) {
                   Finance f = (Finance) finances.get("CREDITCARD");
                   out.println(f.getName() + " &nbsp;");
            }
            if (finances.get("BANK") != null) {
                   Finance f = (Finance) finances.get("BANK");
                   out.println(f.getName() + " &nbsp;");
            }
            
            
            out.println("<hr>");
    }
           session.close();

out.println("</body></html>");


} catch (Exception ex) {
    throw ex;
}

}
}