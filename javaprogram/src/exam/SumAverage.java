package exam;
import java.util.Scanner;
public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int sum = 0;
		double average = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("정수입력: ");
			number = scan.nextInt();
			if (number == 0)
				break;
			sum += number;
			count++;
			average = (double)sum/count;
			System.out.printf("-> 합%d 평균 %.2f \n", sum, average);
			}while(true);
			System.out.println("->종료 ");
			scan.close();
	}

}
