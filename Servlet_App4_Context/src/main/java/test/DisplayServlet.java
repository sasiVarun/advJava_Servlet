package test;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class DisplayServlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String uName = req.getParameter("uname");
		pw.println("Welcome user: "+uName+"<br>");
		pw.println("=====ServletContext=====<br>");
		ServletContext sct = req.getServletContext(); //Accessing ServletContext object
		pw.println("Server Info: "+sct.getServerInfo());
		pw.println("<br>ContextValue: "+sct.getInitParameter("a"));
	}

}
