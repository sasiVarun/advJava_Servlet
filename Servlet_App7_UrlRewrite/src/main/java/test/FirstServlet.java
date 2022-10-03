package test;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String uName = req.getParameter("uname");
		String mId= req.getParameter("mid");
		long phNo = Long.parseLong(req.getParameter("phno"));
		
		pw.println("<a href='second?uname="+uName+"&mId="+mId+"&phno="+phNo+"'>ViewInfo</a>");
	}
}
