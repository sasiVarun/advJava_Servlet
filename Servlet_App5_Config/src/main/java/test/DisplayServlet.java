package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class DisplayServlet extends GenericServlet{

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String uName = req.getParameter("uname");
		pw.println("Welcome user: "+uName);
		
		pw.println("<br>====ServletConfig=====");
		ServletConfig sc = this.getServletConfig();
		pw.println("<br>"+sc.getServletName());
		pw.println("<br>Config value"+sc.getInitParameter("b"));
	}
}
