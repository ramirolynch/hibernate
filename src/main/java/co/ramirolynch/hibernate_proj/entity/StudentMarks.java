package co.ramirolynch.hibernate_proj.entity;

public class StudentMarks {
	
	private Integer studentId;
	private String studentName;
	private int studentScores;
	public StudentMarks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentMarks(String studentName, int studentScores) {
		super();
		this.studentName = studentName;
		this.studentScores = studentScores;
	}
	public StudentMarks(Integer studentId, String studentName, int studentScores) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScores = studentScores;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentScores() {
		return studentScores;
	}
	public void setStudentScores(int studentScores) {
		this.studentScores = studentScores;
	}
	@Override
	public String toString() {
		return String.format("Student [%-3d | %-12s| %-3d]", studentId, studentName, studentScores);
	}

}
