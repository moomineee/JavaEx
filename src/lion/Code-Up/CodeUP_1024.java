import java.util.Scanner;
// String 배열을 문자열로 출력하기
public class CodeUP_1024 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // string 문자열을 출력할때 charAt();을 사용한다.
        for (int i = 0 ; i < str.length(); i++) {
            System.out.printf("'%s'%n", str.charAt(i));
        }
    }
}




