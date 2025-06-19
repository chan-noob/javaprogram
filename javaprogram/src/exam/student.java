package exam;

public class student {
	private String studentNo;
	private String studentName;
	private int grade;
	private String dept;
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "student [studentNo=" + studentNo + ", studentName=" + studentName + ", grade=" + grade + ", dept="
				+ dept + ", getStudentNo()=" + getStudentNo() + ", getStudentName()=" + getStudentName()
				+ ", getGrade()=" + getGrade() + ", getDept()=" + getDept() + "]";
	}
	

}
