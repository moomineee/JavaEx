// 정수 1개 입력받아 2배 곱해 출력하기 (비트 시프트 연산)
// 정수 한 개가 입력된다.
// 단, -1073741824 ~ +1073741823
// 2배 곱한 정수를 출력한다.

import java.util.Scanner;

public class CodeUp_1047 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num * 2);
    }
}
