// 정수 2개 입력받아 나눈 몫 출력하기

import java.util.Scanner;

public class CodeUp_1042 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        int num = (int)((float)a/b);
        System.out.println(num);
    }
}
