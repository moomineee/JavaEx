// 0 입력될 때까지 무한 출력하기2

import java.util.Scanner;

public class CodeUp_1073 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while ( true ) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            System.out.println(num);
        }
    }
}

//        for(int i = 0; i < n; i++) {
//            System.out.println(scanner.nextInt());