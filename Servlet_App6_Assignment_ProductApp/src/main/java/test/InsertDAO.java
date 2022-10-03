package test;
import java.sql.*;
import javax.servlet.*;
public class InsertDAO {
	public int k = 0;
	public int addProduct(ServletRequest req) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into Product38 values(?,?,?,?)");
			
			ps.setString(1,req.getParameter("pcode"));
			ps.setString(2, req.getParameter("pname"));
			ps.setFloat(3,Float.parseFloat(req.getParameter("pprice")));
			ps.setInt(4, Integer.parseInt(req.getParameter("pqty")));
			
			k = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return k;
	}
	
}
