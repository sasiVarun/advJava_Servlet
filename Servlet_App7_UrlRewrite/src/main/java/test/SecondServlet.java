package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		pw.println("Username:"+req.getParameter("uname"));
		pw.println("<br>Maild-ID:"+req.getParameter("mid"));
		pw.println("<br>Phone Number:"+req.getParameter("phno"));
		
	}
}
