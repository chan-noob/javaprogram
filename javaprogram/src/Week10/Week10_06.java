package Week10;
import java.util.Scanner;
public class Week10_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		while (sum <= 500) {
			System.out.print("누적할 값을 입력하세요: ");
			int i = scanner.nextInt();
			
			if (i == 0) {
				break;
			}
			
			sum += i;
			
			System.out.println("현재까지의 누적합은" + sum +"입니다.");
		}
		System.out.println(" ");
		System.out.println("총 누적합은 " + sum + "입니다.");
	}

}
