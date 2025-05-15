package Week11;
import java.util.Scanner;
public class Week11_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 수 입력: ");
        int a = scanner.nextInt();
        System.out.print("두 번째 수 입력: ");
        int b = scanner.nextInt();
        int r;
        int x = (a > b) ? a : b;
        int y = (a > b) ? b : a;

        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }

        System.out.println("최대 공약수는: " + x);
    }
}
		