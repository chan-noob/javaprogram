package exam;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ini, inj;
		Scanner scan = new Scanner(System.in);
		System.out.print("도형의 높이: ");
		ini = scan.nextInt();
		System.out.print("도형의 너비: ");
		inj = scan.nextInt();
		
		System.out.print("사각형\n");
		for(int i=1;i<=ini;i++) {
			for(int j=1; j<=inj; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
