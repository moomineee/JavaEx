// 16진 정수 1개 입력받아 8진수로 출력하기

import java.util.Scanner;

public class CodeUp_1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int DecNum = Integer.parseInt(num, 16);

        String OctNum = Integer.toOctalString(DecNum);

        System.out.println(OctNum);
    }
}
// 다시 볼것. 물어봐야함.


// Integer.parseInt(hex, 16)는 0x가 없는 16진수 문자열을 10진수로 변환
// Long.decode()는 0x로 시작하는 16진수 문자열을 10진수로 변환합니다.