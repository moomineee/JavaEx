// 정수 입력받아 아스키 문자로 출력하기

import java.util.Scanner;

public class CodeUp_1037 {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     int num = scanner.nextInt();

     System.out.println((char)num);
    }
}

// 숫자를 문자로 변환 > 해당하는 아스키코드값으로 변경됨