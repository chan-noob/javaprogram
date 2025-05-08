package Week10;
import java.util.Scanner;
public class Week10_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("행 : ");
		int x = scanner.nextInt();
		System.out.print("열 : ");
		int y = scanner.nextInt();
		
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= y; j++) {
				System.out.printf("[%d][%d] ", i , j);
			}
			System.out.println();
		}
		scanner.close();
	}

}
