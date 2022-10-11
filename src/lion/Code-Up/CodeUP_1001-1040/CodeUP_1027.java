import java.util.Scanner;

// 년월일 입력 받아 형식 바꿔 출력하기
public class CodeUP_1027 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String [] strArr = str.split("\\."); // \\이거 꼭 있어야 함.

        System.out.println(strArr[2] + "-" + strArr[1]+ "-" + strArr[0]);
//        System.out.printf("02%d-, 02%d-, 04%d", strArr[2], strArr[1], strArr[0]);
        // printf는 실패했다....
    }
}





