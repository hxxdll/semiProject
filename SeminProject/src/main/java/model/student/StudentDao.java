package model.student;

public class StudentDao {
	private int studno;
	private String entry;
	private double tograde;
	private int grade;
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public String getEntry() {
		return entry;
	}
	public void setEntry(String entry) {
		this.entry = entry;
	}
	public double getTograde() {
		return tograde;
	}
	public void setTograde(double tograde) {
		this.tograde = tograde;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentDao [studno=" + studno + ", entry=" + entry + ", tograde=" + tograde + ", grade=" + grade + "]";
	}
	
	
}
