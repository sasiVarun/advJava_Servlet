package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/first")
public class FirstServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		Cookie ck1 = new Cookie("uname",req.getParameter("uname"));
		Cookie ck2 = new Cookie("mid",req.getParameter("mid"));
		Cookie ck3 = new Cookie("phno",req.getParameter("phno"));
		
		res.addCookie(ck1);
		res.addCookie(ck2);
		res.addCookie(ck3);
		
		pw.println("<a href='second'>ViewInfo</a>");
		
		System.out.println("===First Servlet===");
		System.out.println("Hashcode of ck1:"+ck1.hashCode());
		System.out.println("Hashcode of ck2:"+ck2.hashCode());
		System.out.println("Hashcode of ck3:"+ck3.hashCode());
	}
}
