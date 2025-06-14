package exam;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		Scanner scan= new Scanner(System.in);
		System.out.print("정수입력: ");
		input = scan.nextInt();
		
		for(int i=1; i<=input; i++) {
			int count = 0;
			for (int j=1; j>=1; j--) {
				if(i%j == 0)
					count++;
			}
			if(count==2)
				System.out.println(i+"is prime number");
		}
		scan.close();
	}

}
