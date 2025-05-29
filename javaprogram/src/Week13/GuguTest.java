package Week13;
import java.util.Scanner;
public class GuguTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input_dan = new Scanner(System.in);
		int input = 0;
		
		System.out.print("단을 입력: ");
		input = input_dan.nextInt();
		Gugu dan2 = new Gugu();
		dan2.setDan(input);
		dan2.printGugu();
		
		dan2.setDan(8);
		dan2.printGugu();
	}

}
