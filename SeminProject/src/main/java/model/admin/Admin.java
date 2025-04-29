package model.admin;

public class Admin {
	private int admno;
	private String password;
	public int getAdmno() {
		return admno;
	}
	public void setAdmno(int admno) {
		this.admno = admno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminDao [admno=" + admno + ", password=" + password + "]";
	}
}
