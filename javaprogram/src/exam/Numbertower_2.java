package exam;

public class Numbertower_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int place = 10, i, result = 0;

        System.out.println("1)\n");
        for(i = 1; i <= 5; i++) {
            result += +i;
            System.out.println(result);
            result *= place;
        }

        result = 0;
        System.out.println("\n2)\n");
        for(i = 1; i <= 9; i += 2) {
            result += +i;
            System.out.println(result);
            result *= place;
        }
    }
}