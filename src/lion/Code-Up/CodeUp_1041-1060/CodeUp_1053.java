//  [기초-논리연산] 참 거짓 바꾸기

import java.util.Scanner;

public class CodeUp_1053 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a == 0) {
            System.out.println(1);
        } else if (a == 1){
            System.out.println(0);
        }
//        System.out.println(a != b ? 1 : 0);
    }
}
