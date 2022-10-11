// 정수 2개 입력받아 자동 계산하기

import java.util.Scanner;

public class CodeUp_1045 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a +b );
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((a / b));
        System.out.println(a % b);
        System.out.printf("%.02f", (float)a/b);
    }
}