package exam;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("파보니치수열의 마지막 항을 입력하시오: ");
		int n, next;
		int f0 = 0;
		int f1 = 1;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i=0; i<n; i++) {
			if(i<2) {
				System.out.print(i + " ");
				continue;
			}
			next = f0 + f1;
			System.out.print(next + " ");
			f0 = f1;
			f1 = next;
		}
	}

}
