package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/log1")
public class UserLoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		String fname = new LoginDAO().login(req);
		if(fname == null) {
			req.setAttribute("msg", "Invalid Login Proces..");
			req.getRequestDispatcher("Fail.jsp").forward(req, res);
		}else { 
			HttpSession hs = req.getSession();
			hs.setAttribute("fname", fname);
			req.getRequestDispatcher("User.jsp").forward(req, res);
		}
	}
}
