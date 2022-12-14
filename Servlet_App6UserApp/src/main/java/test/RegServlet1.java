package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/reg1")
@SuppressWarnings("serial")
public class RegServlet1 extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		UserBean ub = new UserBean();
		ub.setuName(req.getParameter("uname"));
		ub.setpWord(req.getParameter("pword"));
		ub.setfName(req.getParameter("fname"));
		ub.setlName(req.getParameter("lname"));
		
		ServletContext sct = req.getServletContext();
		sct.setAttribute("bean", ub);
		
		RequestDispatcher rd = req.getRequestDispatcher("reg2.html");
		rd.forward(req, res);
	}
}
