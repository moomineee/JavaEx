// 정수 3개 입력받아 가장 작은 수 출력하기

import java.util.Scanner;

public class CodeUp_1064 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = ((c < a ) ? (c < b ? c : b) : (a < b ? a : b));

        System.out.println(result);
    }
}
// (number1 > number2) ?
//        (number1 > number3 ? number1 : number3)
//        : (number2 > number3 ? number2 : number3)