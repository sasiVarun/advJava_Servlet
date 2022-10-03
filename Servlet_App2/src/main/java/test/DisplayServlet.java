package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/dis")
public class DisplayServlet implements Servlet{

	public void init(ServletConfig sc) throws ServletException {
		//NoCode
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String uName = req.getParameter("uname");
		String mId = req.getParameter("mid");
		long phno = Long.parseLong(req.getParameter("phno"));
		pw.println("<br>====UserDetails=====");
		pw.println("<br>Username:"+uName);
		pw.println("<br>Mail Id:"+mId);
		pw.println("<br>phno:"+phno);
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
