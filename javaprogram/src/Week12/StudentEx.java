package Week12;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();

        std1.setStudentNo("20255284");
        std1.setStudentName("지현찬");
        std1.setGrade(1);
        std1.setDept("소프트웨어학부");

        std2.setStudentNo("20230102");
        std2.setStudentName("철수");
        std2.setGrade(2);
        std2.setDept("전자공학과");

        std3.setStudentNo("20230103");
        std3.setStudentName("짱구");
        std3.setGrade(3);
        std3.setDept("기계공학과");

        System.out.println(std1);
        System.out.println(std2);
        System.out.println(std3);
    }
}

