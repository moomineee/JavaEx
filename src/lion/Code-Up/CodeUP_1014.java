import java.util.Scanner;

public class CodeUP_1014 {
//2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch1 = scanner.next().charAt(0);
        char ch2 = scanner.next().charAt(0);

        System.out.printf("%c %c", ch2, ch1);
    }
}



