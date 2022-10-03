package test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		Cookie c[] = req.getCookies();
		if(c==null) {
			req.setAttribute("msg", "Session Expired...");
			RequestDispatcher rd = req.getRequestDispatcher("LoginFail.jsp");
			rd.forward(req, res);
		}else {
			String fname = c[0].getValue();
			req.setAttribute("fname", fname);
			RequestDispatcher rd = req.getRequestDispatcher("ViewProfile.jsp");
			rd.forward(req, res);
		}
	}
}
