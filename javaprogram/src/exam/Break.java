package exam;
import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first;
		int second;
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요: ");
		first = in.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		second = in.nextInt();
		
		for(int i=2; i<=100; i++) {
			if(i % first == 0 && i % second == 0) {
				System.out.println("공배수" + i);
			}
		}
		in.close();
	}

}
