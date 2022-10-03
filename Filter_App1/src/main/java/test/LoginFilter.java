package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebFilter("/log")
public class LoginFilter implements Filter{
	@Override
	public void init(FilterConfig fc)throws ServletException{
		
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain)throws ServletException,IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String userName = req.getParameter("uname");
		if(userName.equals("nit")) {
			chain.doFilter(req, res);//Linking to Servlet
		}else {
			pw.println("Invalid Login process...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("input.html");
			rd.include(req, res);
		}
	}
	
	@Override
	public void destroy() {
		
	}
}
