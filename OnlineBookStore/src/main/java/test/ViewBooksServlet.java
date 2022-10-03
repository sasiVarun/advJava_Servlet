package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewBooksServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...");
			req.getRequestDispatcher("Fail.jsp").forward(req, res);
		}else {
			ArrayList<BookBean> al = new RetrieveDAO().retrieve();
			hs.setAttribute("al", al);
			req.getRequestDispatcher("View.jsp").forward(req, res);
		}
	}
}
