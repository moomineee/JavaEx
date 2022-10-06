import java.util.Scanner;

// 정수 1개 입력받아 나누어 출력하기
public class CodeUP_1025 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numUnit = {10000, 1000, 100, 10, 1};

        for (int i = 0; i < numUnit.length; i++) {
            int result = num / numUnit[i] * numUnit[i];
            num = num - result;
            System.out.printf("[%d]\n", result);
        }
    }
}






