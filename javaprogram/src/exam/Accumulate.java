package exam;
import java.util.Scanner;
public class Accumulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		while(sum <=500) {
			System.out.print("누적할 값을 입력하세요: ");
		i = scan.nextInt();
		if(i == 0) break;
		sum += i;
		System.out.printf("현재까지의 누적합은 %d입니다. \n", sum);
			
		
		}
		System.out.printf("\n총 누적합은 %d입니다.", sum);
	}

}
