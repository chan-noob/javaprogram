package Week10;

public class Week10_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %-4d", j, i, j * i);
			}
			System.out.println(" ");
		}
		}
}

