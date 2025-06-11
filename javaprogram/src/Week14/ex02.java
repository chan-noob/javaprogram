package Week14;

public class ex02 {
	
	public static void print_01(int[][] arr) {
        System.out.println("1)");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] ");
            }
            System.out.println();
        }
    }

    public static void print_02(int[][] arr) {
        System.out.println("2)");
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print("[" + i + "][" + j + "] ");
            }
            System.out.println();
        }
    }

    public static void print_03(int[][] arr) {
        System.out.println("3)");
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("[" + j + "][" + i + "] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[5][5]; 
        
        print_01(a);
        print_02(a); 
        print_03(a); 
    }
}