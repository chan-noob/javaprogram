package exam;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fact = 1;
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("팩토리얼을 계산할 정수 입력: ");
		n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
			fact *= i;
		
		System.out.println(n+"!의 값은 " + fact);
	}

}
