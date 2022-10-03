package test;
import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.*;
@WebServlet("/book")
public class Book38 implements Servlet{

	@Override
	public void destroy() {
		//No Code
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return this.getServletConfig();
	}

	@Override
	public String getServletInfo() {
		
		return "Book38";
	}

	@Override
	public void init(ServletConfig sc) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String bcode = req.getParameter("bcode");
		String bname = req.getParameter("bname");
		String bauthor = req.getParameter("bauthor");
		float bprice = Float.parseFloat(req.getParameter("bprice"));
		int bqty = Integer.parseInt(req.getParameter("bqty"));
		pw.println("<br>====BookDetails=====");
		pw.println("<br>Book Code:"+bcode);
		pw.println("<br>Book Name:"+bname);
		pw.println("<br>Book Author:"+bauthor);
		pw.println("<br>Book Price:"+bprice);
		pw.println("<br>Book Quantity:"+bqty);
	}

}
