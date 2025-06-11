package Week14;

public class ex04 {
	public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6, 7, 8, 9, 10, 11, 12, 13},
            {14, 15}
        };

        print(array);
    }
}