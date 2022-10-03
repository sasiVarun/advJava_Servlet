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
			Cookie c[] = req.getCookies();
			if(c==null) {
				req.setAttribute("msg", "Session Expired..");				
			}else {
				c[0].setMaxAge(0);
				req.setAttribute("msg", "User Logged Out Successfully..");
			}//End of else			
			RequestDispatcher rd = req.getRequestDispatcher("LoginFail.jsp");
			rd.forward(req, res);
		}
}
