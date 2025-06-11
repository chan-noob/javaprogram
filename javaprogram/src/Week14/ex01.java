package Week14;

public class ex01 {


	public static void print(int[] array) {
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			System.out.println("배열["+i+"] =" +array[i]);
			sum = sum + array[i];
	}
		System.out.println("배열의 합  : "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		print(a);
	}
}
