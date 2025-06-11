package Week14;

import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("학생 수 입력: ");
        int size = scan.nextInt();
        scan.nextLine(); // 개행 문자 처리

        Student[] stds = new Student[size];

        for (int i = 0; i < stds.length; i++) {
            System.out.print("학생 이름 입력: ");
            String std_name = scan.nextLine();

            System.out.print("학생 나이 입력: ");
            int std_age = scan.nextInt();
            scan.nextLine(); // 개행 문자 처리

            stds[i] = new Student(std_name, std_age);
        }

        // 배열 인덱스로 출력
        for (int i = 0; i < stds.length; i++) {
            System.out.print("stds[" + i + "].name=" + stds[i].getName() + "\t");
            System.out.println("stds[" + i + "].age=" + stds[i].getAge());
        }

        // 향상된 for문으로 출력
        System.out.println("\n[학생 목록 출력]");
        for (Student data : stds) {
            System.out.println(data.getName() + ", " + data.getAge());
        }

        scan.close();
    }
}