// 10진수를 입력받아 8진수(octal)로 출력해보자.

import java.util.Scanner;

public class CodeUp_1031 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        String octal = Integer.toOctalString(decimal);

        System.out.println(octal);
    }
}
