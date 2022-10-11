// 10진수를 입력받아 16진수(hexa)로 출력해보자.


import java.util.Scanner;

public class CodeUp_1032 {
    public static void main(String[] args) {

        Scanner scammer = new Scanner(System.in);
        int dec = scammer.nextInt();
        String hexa = Integer.toHexString(dec);

        System.out.println(hexa);
    }
}
