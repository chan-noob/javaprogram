package exam;
import java.util.Scanner;
public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int ini, inj;
		System.out.print("행: ");
		ini = scan.nextInt();
		System.out.print("열: ");
		inj = scan.nextInt();
		
		for(int i=0;i<ini; i++) {
			for(int j=0;j<inj; j++) {
				System.out.printf("[%d][%d] ", i, j);
			}
			System.out.println();
		}
	}

}
