package exam;
import java.util.Scanner;
public class Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("크기입력: ");
		int n;
		n = scan.nextInt();
		for(int i=0; i<n; i++) {
			System.out.printf("[%d]\t", i);
		}
	}

}
