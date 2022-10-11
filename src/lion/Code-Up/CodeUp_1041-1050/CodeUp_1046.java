// 정수 2개 입력받아 자동 계산하기

import java.util.Scanner;

public class CodeUp_1046 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a+b+c;
        float avg = sum / 3f;

        System.out.println(sum);
        System.out.printf("%.01f", avg);
    }
}
