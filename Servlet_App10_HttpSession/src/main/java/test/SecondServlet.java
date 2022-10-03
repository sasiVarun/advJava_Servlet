package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/second")
public class SecondServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		HttpSession hs = req.getSession(false);//Accessing Session
		
		pw.println("Username: "+ hs.getAttribute("uname"));
		pw.println("<br> Mail Id: "+ hs.getAttribute("mid"));
		pw.println("<br> Phone Number: "+ hs.getAttribute("phno"));
		hs.invalidate();
		System.out.println("====Second Servlet====");
		System.out.println("Hashcode of hs:"+hs.hashCode());
	}
}
