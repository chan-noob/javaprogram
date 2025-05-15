package Week11;
import java.util.Scanner;
public class Week11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("출력 최대값 입력 : ");
        int n = scanner.nextInt();

        System.out.print("소수 : ");
        for (int i=2; i<=n; i++) {
            int count = 0;
            for (int j=i; j>0; j--) {
                if (i%j==0) {
                    count++;
                }
            }
            if (count != 2) continue; 
            System.out.printf("%d ", i);
        }
    }
}