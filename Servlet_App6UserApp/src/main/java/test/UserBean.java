package test;
import java.io.*;
@SuppressWarnings("serial")
public class UserBean implements Serializable{
	private String uName;
	private String pword;
	private String fname;
	private String lname;
	private String addr;
	private String mId;
	private long phNo;
	
	public UserBean() {}
	
	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getpWord() {
		return pword;
	}

	public void setpWord(String pword) {
		this.pword = pword;
	}

	public String getfName() {
		return fname;
	}

	public void setfName(String fname) {
		this.fname = fname;
	}

	public String getlName() {
		return lname;
	}

	public void setlName(String lname) {
		this.lname = lname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	
}
