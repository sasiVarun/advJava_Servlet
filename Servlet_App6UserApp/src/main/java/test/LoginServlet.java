package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/login")
@SuppressWarnings("serial")
public class LoginServlet extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String fName = new LoginDAO().login(req);
		if(fName == null) {
			pw.println("Invalid Login Process...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}else {
			pw.println("Welcome user "+fName +"<br>");
			pw.println("Login Successfull...");
		}
	}
}
