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
		
		pw.println("<form action='second' method='post'>");
		pw.println("<input type='hidden' name='uname' value='"+uName+"'>");
		pw.println("<input type='hidden' name='mid' value='"+mId+"'>");
		pw.println("<input type='hidden' name='phno' value='"+phNo+"'>");
		pw.println("<input type='submit' value='ViewInfo'>");
		pw.println("</form>");
	}
}
