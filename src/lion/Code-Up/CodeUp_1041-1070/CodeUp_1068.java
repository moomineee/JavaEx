// 정수 1개 입력받아 평가 출력하기

import java.util.Scanner;

public class CodeUp_1068 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (100 >= a &&a >= 90) {
            System.out.println("A");
        } else if (89 >= a && a >= 70 ) {
            System.out.println("B");
        } else if (69 >= a && a >= 40) {
            System.out.println("C");
        } else if (39 >= a && a >= 0) {
            System.out.println("D");
        }
    }
}