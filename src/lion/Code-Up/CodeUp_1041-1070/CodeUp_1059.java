// 비트단위로 NOT 하여 출력하기

import java.util.Scanner;

public class CodeUp_1059 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        // ~ : 	비트를 1이면 0으로, 0이면 1로 반전시킴. (비트 NOT 연산, 1의 보수)
        System.out.println(~a);
    }
}
