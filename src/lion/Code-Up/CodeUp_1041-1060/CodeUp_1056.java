// 참/거짓이 서로 다를 때에만 참 출력하기

import java.util.Scanner;

public class CodeUp_1056 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a != b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
//        System.out.println(a != b ? 1 : 0);
    }
}
