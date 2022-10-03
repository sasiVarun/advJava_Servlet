package test;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
			HttpSession hs = req.getSession(false);
			if(hs==null) {
				req.setAttribute("msg", "Session Expired..");				
			}else {
				hs.invalidate();
				req.setAttribute("msg", "LoggedOut Successfully..");
			}//End of else			
			RequestDispatcher rd = req.getRequestDispatcher("Fail.jsp");
			rd.forward(req, res);
		}
}
