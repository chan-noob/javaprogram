package exam;

public class Numberarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1; i<=50; i++) {
			if(i%3==0 || i%5==0) {
				System.out.print("  *");
				continue;
			}
			System.out.printf("%3d", i);
			
		}
	}

}
