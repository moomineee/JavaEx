// 문자 1개 입력받아 다음 문자 출력하기

import java.util.Scanner;

public class CodeUp_1041 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ch = scanner.next().charAt(0);
        int num = ch + 1;
        System.out.println((char)num);
    }
}
