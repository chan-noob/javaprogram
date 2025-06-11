package Week14;

import java.util.Scanner;

public class ex05 {

    public static void inputAry(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("> 배열 입력");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("배열[" + i + "] = ");
            arr[i] = input.nextInt();
        }
    }

    public static void searchAry(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.print("> 찾을 값 선택 : ");
        int n = input.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                System.out.println("찾는 값은 배열[" + i + "]에 위치");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("찾는 값이 배열에 없습니다.");
        }
    }

    // 배열을 정렬하는 메서드 (선택 정렬)
    public static void rangeAry(int[] arr) {
        int temp;
        int least;

        for (int i = 0; i < arr.length - 1; i++) {
            least = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            // swap
            temp = arr[i];
            arr[i] = arr[least];
            arr[least] = temp;
        }

        System.out.print("> 정렬된 배열 : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printAry(int[] arr) {
        System.out.println("> 배열 출력");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("배열[" + i + "] : " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        boolean isEntered = false;

        while (true) {
            System.out.println("******************");
            System.out.println("배열 처리 프로그램");
            System.out.println("******************");
            System.out.println("[1] 배열 입력");
            System.out.println("[2] 배열 검색");
            System.out.println("[3] 배열 정렬");
            System.out.println("[4] 배열 출력");
            System.out.println("[0] 종료");
            System.out.println("******************");
            System.out.print("선택 : ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    inputAry(arr);
                    isEntered = true;
                    break;
                case 2:
                    if (isEntered)
                        searchAry(arr);
                    else
                        System.out.println("먼저 배열을 입력하세요.");
                    break;
                case 3:
                    if (isEntered)
                        rangeAry(arr);
                    else
                        System.out.println("먼저 배열을 입력하세요.");
                    break;
                case 4:
                    if (isEntered)
                        printAry(arr);
                    else
                        System.out.println("먼저 배열을 입력하세요.");
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
