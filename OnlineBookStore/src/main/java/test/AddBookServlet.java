package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddBookServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		HttpSession hs = req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired..");
			req.getRequestDispatcher("Fail.jsp").forward(req, res);
		}else {
			int k = new InsertDAO().insert(req);
			if(k>0) {
				req.getRequestDispatcher("AddBook.jsp").forward(req, res);
			}
		}
	}
}
