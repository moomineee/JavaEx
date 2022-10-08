import java.util.Scanner;

public class LogicPrac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch = ' ';   //문자를 반환해야함. 이 부분 주의

        System.out.println("문자를 하나 입력하세요 > ");
        String str = scanner.nextLine(); // 문자 입력
        ch = str.charAt(0); // 입력된 문자열을 문자로 전환

        if ('0' <= ch && ch <= '9') {
            System.out.printf("입력하신 문자는 숫자 %d입니다.%n", ch);
        }
        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.printf("입력하신 문자는 영문자 %s입니다.%n", ch); // %s, %d 사용 주의
        }
    }
}

