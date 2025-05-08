package Week10;
import java.util.Scanner;
public class Week10_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구구단 단을 입력하세요: ");
        int input = scanner.nextInt();
        
        if (input >= 1 && input <= 9) {
        	for (int i = 1; i <= 9; i++) {
        		System.out.printf("%d * %d = %d%n", input, i, input * i);
        	}
        } else {
        		System.out.println("1부터 9 사이의 정수를 입력해야 합니다.");
        	}
        	scanner.close();
        }
	}

