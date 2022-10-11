// 8진 정수 1개 입력받아 10진수로 출력하기


import java.util.Scanner;

public class CodeUp_1034 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String oct = scanner.next();
        int dec = Integer.parseInt(oct, 8);

        // Integer.parseInt(String s, int radix)
        // radix는 어떤 진수의 값으로 변환할 것인지에 대한 진수값.
        // 반환할 타입의 진수를 넣는다.

        System.out.println(dec);
    }
}
