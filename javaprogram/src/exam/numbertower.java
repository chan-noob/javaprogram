package exam;

public class numbertower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1)\n");
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		
		}
		System.out.print("2)\n");
		System.out.println();
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i*2; j+=2) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
