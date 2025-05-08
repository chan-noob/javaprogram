package Week10;

public class Week10_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<=50; i++) {
			if (i % 3==0 || i%5== 0) {
				System.out.print("* ");
			} else {
				System.out.printf("%d ", i);
			}
		}
	}

}
