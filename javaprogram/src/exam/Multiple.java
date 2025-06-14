package exam;
import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		number = scan.nextInt();
		
		for( int i = number + 1; i <= 100; i++) {
			if( i % number != 0 )
				continue;
			System.out.print(i + " ");
		}
	scan.close();	
}
}

