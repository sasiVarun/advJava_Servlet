package test;

import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/xyz")
public class FirstServlet implements Servlet {

	public void init(ServletConfig sc) throws ServletException {
		//NoCode
		System.out.println("ServletConfig:"+sc.getServletName());
		System.out.println("ServletConfig:"+sc.getServletContext());
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("Welcome to Servlet Programming...");
	}

	public void destroy() {
		//NoCode
	}

	public String getServletInfo() {
		return "FirstServlet";
	}
	
	public ServletConfig getServletConfig() {

		return this.getServletConfig();
	}

}
