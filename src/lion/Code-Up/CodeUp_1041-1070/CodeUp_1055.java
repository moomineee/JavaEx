// 하나라도 참이면 참 출력하기

import java.util.Scanner;

public class CodeUp_1055 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
//        System.out.println(a != b ? 1 : 0);
    }
}
