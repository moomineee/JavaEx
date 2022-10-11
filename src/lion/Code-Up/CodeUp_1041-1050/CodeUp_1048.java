// 한 번에 2의 거듭제곱 배로 출력

import java.util.Scanner;

public class CodeUp_1048 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println((int)(a * Math.pow(2, b)));
    }
}


// 거듭제곱 = Math.pow(a, b);
// a는 밑, b는 지수
// Math.pow는 입-출력값이 실수이다.