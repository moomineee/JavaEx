import java.util.Scanner;

// 시 분 초를 입력 받아 분만 출력하기
public class CodeUP_1026 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String [] strArr = str.split(":");
        int i = Integer.parseInt(strArr[1]);
        System.out.println(i);

    }
}
// 입력 받는다 > scanner
// '분만' 출력 > Split
// 그렇게 하기 위해선 문자열을 배열로 나누어 입력 받아야 함.
// : 단위로 쪼개서 배열에 입력하고 분에 해당하는 1번 배열 출력





