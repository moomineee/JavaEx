// 두 정수 입력받아 비교하기

import java.util.Scanner;

public class CodeUp_1049 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}


//삼항연산자로 풀어보면
//sout ( a > b ? 1 : 0)