package exam;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("이등변삼각형 (높이만 사용)\n");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
