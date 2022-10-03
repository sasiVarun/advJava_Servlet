package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.sql.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProductServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		ReterieveDAO rad = new ReterieveDAO();
		ResultSet rs = rad.viewProducts();
		try {
			if (rs.next()) {
				rs.beforeFirst();
					pw.println("<style> table { border-collapse: collapse;} th, td { border: 1px solid;} </style>");
					pw.println("<table>");
					pw.println("<tr><th>PCODE</th><th>PCODE</th><th>PPRICE</th><th>PQTY</th><tr>");
					while (rs.next()) {
						pw.println("<tr>");
						pw.println("<td>"+rs.getString(1)+"</td>"+"<td>"+rs.getString(2)+"</td>"+"<td>"+rs.getString(3)+"</td>"+"<td>"+rs.getString(4)+"</td>");
						pw.println("</tr>");
					}
					pw.println("</table>");
									
			} else {
				pw.println("No records to display in Product38...");
			}
			
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.include(req, res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
