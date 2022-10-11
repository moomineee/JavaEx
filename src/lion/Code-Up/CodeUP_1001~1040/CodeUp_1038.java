// 정수 2개 입력받아 합 출력하기

import java.util.Scanner;

public class CodeUp_1038 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Long a = scanner.nextLong();
        Long b = scanner.nextLong();

        Long sum = a + b;

        System.out.println(sum);
    }
}

