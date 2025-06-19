package exam;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i;
		int sum = 0;
		int count = 1;
		double average = 0;
		do {
		System.out.print("정수입력: ");
		i = scan.nextInt();
		if(i==0) break;
		sum += i;
		average = (double)sum/count;
		System.out.printf("-> 합:%d 평균:%.1f\n", sum, average);
		count++;
		} while(true);
		
		System.out.print("-> 종료");
	}

}
