package exam;
import java.util.Scanner;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f0 = 0;
		int f1 = 1;
		int next;
		int input;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파보나치 수열 개수 입력: ");
		input = scan.nextInt();
		for (int i=1; i<=input; i++) {
			if(i<=2) {
				System.out.print(i-1 + " ");
				continue;
			}
			next = (f0 + f1);
			System.out.print(next + " ");
			f0 = f1;
			f1 = next;
		}
		System.out.println();
		scan.close();
	}

}
