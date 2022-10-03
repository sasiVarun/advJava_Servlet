package test;
import java.sql.*;
import javax.servlet.http.*;
public class InsertDAO {
	public int k = 0;
	public int insert(HttpServletRequest req) {
		try {
			Connection con  = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into Book38 values(?,?,?,?,?)");
			ps.setString(1,req.getParameter("bcode"));
			ps.setString(2,req.getParameter("bname"));
			ps.setString(3,req.getParameter("bauthor"));
			ps.setFloat(4,Float.parseFloat(req.getParameter("bprice")));
			ps.setInt(5, Integer.parseInt(req.getParameter("bqty")));
			
			k=ps.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
