package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet("/login")
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		UserBean ub = new LoginDAO().login(req);
		if(ub == null) {
			req.setAttribute("msg", "Invalid Login Proces.." );
			RequestDispatcher rd = req.getRequestDispatcher("LoginFail.jsp");
			rd.forward(req, res);
		}else {
			req.setAttribute("fname",ub.getfName());
			Cookie ck = new Cookie("fname",ub.getfName());
			res.addCookie(ck);
			RequestDispatcher rd = req.getRequestDispatcher("LoginSuccess.jsp");
			rd.forward(req, res);
		}
	}
}
