// 정수 1개 입력받아 카운트다운 출력하기

import java.util.Scanner;

public class CodeUp_1074 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while ( n > 0 ) {
            System.out.println(n);
            n--;
        }
    }
}

//        for(int i = n; i > 0; i--) {
//            System.out.println(i);