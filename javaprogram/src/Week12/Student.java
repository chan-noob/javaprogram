package Week12;

public class Student {
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

    public String toString() {
        return "Student [studentNo=" + studentNo +
                ", studentName=" + studentName +
                ", grade=" + grade +
                ", dept=" + dept + "]";
    }
} 
