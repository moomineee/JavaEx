// 정수 3개 입력받아 가장 작은 수 출력하기

import java.util.Scanner;

public class CodeUp_1063 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a > b ? a : b);
    }
}