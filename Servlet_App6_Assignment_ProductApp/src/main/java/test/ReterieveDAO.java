package test;
import java.sql.*;
public class ReterieveDAO {
	public ResultSet rs=null;
	public ResultSet viewProducts() {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from Product38",1004,1007);			
			rs = ps.executeQuery();			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
}
