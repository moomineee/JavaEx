//정수 입력받아 계속 출력하기

import java.util.Scanner;

public class CodeUp_1072 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while ( true ) {
            int num = scanner.nextInt();
            System.out.println(num);
        }
    }
}

//        for(int i = 0; i < n; i++) {
//            System.out.println(scanner.nextInt());