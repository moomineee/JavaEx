// [기초-비교연산] 두 정수 입력받아 비교하기4

import java.util.Scanner;

public class CodeUp_1051 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
//        System.out.println(a <= b ? 1 : 0);
    }
}