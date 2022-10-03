package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddProductServlet extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		InsertDAO id = new InsertDAO();
		int result = id.addProduct(req);
		if(result>0) {
			pw.println("Product Inserted Successfully");
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.include(req, res);
		}	
	}
}
