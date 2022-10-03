package test;
import java.io.*;
import javax.servlet.*;
public class DisplayFilter implements Filter{
	public FilterConfig fc;
	
	public void init(FilterConfig fc) throws ServletException{
		this.fc = fc;
	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String userName = req.getParameter("uname");
		pw.println("Welcome User: "+userName);
		pw.println("<br>====FilterConfig====");
		pw.println("<br>FilterName:"+fc.getFilterName());
		pw.println("<br>ConfigValue:"+fc.getInitParameter("a"));
	}
}
