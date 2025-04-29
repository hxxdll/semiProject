package model.professor;

public class ProfessorDao {
	private int profno;

	public int getProfno() {
		return profno;
	}

	public void setProfno(int profno) {
		this.profno = profno;
	}

	@Override
	public String toString() {
		return "ProfessorDao [profno=" + profno + "]";
	}
	
}	
