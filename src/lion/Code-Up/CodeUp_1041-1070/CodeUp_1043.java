// 정수 2개 입력받아 나눈 몫 출력하기2

import java.util.Scanner;

public class CodeUp_1043 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Long a = scanner.nextLong();
        Long b = scanner.nextLong();

        int num = (int)((Long)a%b);
        System.out.println(num);
    }
}
