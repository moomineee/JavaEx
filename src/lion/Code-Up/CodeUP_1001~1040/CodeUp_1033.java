// 10진수를 16진수(대문자)로 출력한다.


import java.util.Scanner;

public class CodeUp_1033 {
    public static void main(String[] args) {

        Scanner scammer = new Scanner(System.in);
        int dec = scammer.nextInt();
        String hexa = Integer.toHexString(dec);

        System.out.println(hexa.toUpperCase());   // toUpperCase 대상 문자열을 모두 대문자로 반환
    }
}
