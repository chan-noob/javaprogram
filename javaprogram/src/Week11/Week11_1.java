package Week11;
import java.util.Scanner;
public class Week11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("도형의 높이 : ");
		int height = scanner.nextInt();
		
		System.out.print("도형의 너비 : ");
		int width = scanner.nextInt();
		
		System.out.println("[ex01] 사각형");
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("[ex02] 직각삼각형");
		for(int i=0; i<=height; i++) {
			for(int j=0; j<1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("[ex03] 이등변 삼각형");
		for (int i=1; i<=height; i++) {
			for (int s=1; s<height - i; s++) {
				System.out.print(" ");
			}
			for (int j=0; j<(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
	}
		System.out.println("[ex04] 역삼각형");
		for (int i=height; i>=1; i--) {
			for(int s=0; s<height-i; s++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
