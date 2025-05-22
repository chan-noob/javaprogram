package Week12;
import java.util.Scanner;
public class ObesityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Obesity ob = new Obesity();

        System.out.print("키 입력: ");
        double height = scanner.nextDouble();
        ob.setHeight(height);

        System.out.print("몸무게 입력: ");
        double weight = scanner.nextDouble();
        ob.setWeight(weight);

        ob.calcstd_weight(); 
        double bmi = ob.calcBmi(); 

        System.out.println("비만도는 " + bmi + "로 " + ob.printBmi() + "입니다.");
        
        scanner.close();
	}

}
