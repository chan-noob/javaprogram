package exam;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("출력 최대값 입력: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1; i<=n; i++) {
			int count = 0;
			for(int j=i; j>=1; j--) {
				if(i%j==0) count++;			
				}

			if(count != 2) continue;
			System.out.printf("%d ", i);

		}
	}

}
