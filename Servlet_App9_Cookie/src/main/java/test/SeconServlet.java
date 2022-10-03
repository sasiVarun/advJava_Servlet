package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/second")
public class SeconServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		Cookie c[] = req.getCookies();
		pw.println("Username: "+ c[0].getValue());
		pw.println("<br>Mail-ID:" + c[1].getValue());
		pw.println("<br>Phone No:"+ Long.parseLong(c[2].getValue()));
		
		System.out.println("===Second Servlet===");
		System.out.println("Hashcode of ck1:"+c[0].hashCode());
		System.out.println("Hashcode of ck2:"+c[1].hashCode());
		System.out.println("Hashcode of ck3:"+c[2].hashCode());
	}
}