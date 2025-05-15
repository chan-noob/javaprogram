package Week11;
import java.util.Scanner;
public class Week11_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int menu;
        int a, b, result = 0;

        do {
            System.out.println("숫자입력");
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("5. 종료");
            System.out.print("메뉴선택: ");
            menu = input.nextInt();
            if (menu == 5) break;
            System.out.print("계산할 값 두 개를 입력 하세요: ");
            a = input.nextInt();
            b = input.nextInt();

            switch (menu) {
                case 1:
                    result = a+b;
                    System.out.printf("결과 %d\n", result);
                    break;
                case 2:
                    result = a-b;
                    System.out.printf("결과 %d\n", result);
                    break;
                case 3:
                    result = a*b;
                    System.out.printf("결과 %d\n", result);
                    break;
                case 4:
                    
                    result = a/b;
                    System.out.printf("결과 %f\n", (double)result);
                    break;
                default: break;
        	}
        } while (menu != 5);
        	System.out.println("종료");
    }
}