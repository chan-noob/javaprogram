package exam;
import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단 단을 입력하세요: ");
		i = scanner.nextInt();
		
		for (j=1; j<=9; j++) {
			System.out.printf("%d * %d = %d\n", i, j, i*j);
		}
	}

}
