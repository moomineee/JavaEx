// 정수 3개 입력받아 짝/홀 출력하기

import java.util.Scanner;

public class CodeUp_1066 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        } if (b % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        } if (c % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
