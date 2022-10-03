package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/first")
public class FirstServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		HttpSession hs = req.getSession();//Creating Session
		hs.setAttribute("uname", req.getParameter("uname"));
		hs.setAttribute("mid", req.getParameter("mid"));
		hs.setAttribute("phno", req.getParameter("phno"));
		pw.println("Session Created<br>");
		pw.println("<a href='second'>ViewInfo</a>");
		System.out.println("====First Servlet====");
		System.out.println("Hashcode of hs:"+hs.hashCode());
	}
}
