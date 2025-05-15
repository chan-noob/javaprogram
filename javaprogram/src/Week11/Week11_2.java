package Week11;
import java.util.Scanner;
public class Week11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int in, sum=0, i=0;
        double average;

        do {
            System.out.print("정수입력 : ");
            in = input.nextInt();
            if (in==0) break;
            sum += in;
            i++;
            average = (double) sum / i;
            System.out.printf("-> 합: %d 평균 %.1f\n", sum, average);
        } while (true);

        System.out.println("-> 종료");
    }
}