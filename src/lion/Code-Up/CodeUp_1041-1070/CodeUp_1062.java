// 비트단위로 NOT 하여 출력하기

import java.util.Scanner;

public class CodeUp_1062 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a ^ b);
    }
}