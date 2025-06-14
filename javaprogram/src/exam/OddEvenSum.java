package exam;
import java.util.Scanner;
public class OddEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int oddSum = 0;
		int evenSum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		number = scan.nextInt();
		
		for( int i=1; i<=number; i++) {
			if(i%2 == 0)
				evenSum += i;
			else
				oddSum += i;
		}
		System.out.format("1부터 %d까지의 정수중 홀수의 합은 %d 짝수의 합은 %d 입니다.", number, oddSum, evenSum);
		scan.close();
	}

}
