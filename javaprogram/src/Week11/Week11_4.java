package Week11;
import java.util.Scanner;
public class Week11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("피보나치수열의 마지막 항을 입력하시오: ");
        int in = scanner.nextInt();

        int f0 = 0, f1 = 1, next;

        for (int i=0; i<in; i++) {
            if (i < 2) {
                System.out.print(i + " ");
                continue;
            }
            next = f0 + f1;
            	System.out.print(next + " ");
            	f0 = f1;
            	f1 = next;
        }
    }
}