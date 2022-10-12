// 비트단위로 NOT 하여 출력하기

import java.util.Scanner;

public class CodeUp_1060 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

//        System.out.println(a & b);
//        이렇게 해도 된다..

        String c = Integer.toBinaryString(a);
        String d = Integer.toBinaryString(b);

        System.out.println((Integer.parseUnsignedInt(c, 2)) & (Integer.parseUnsignedInt(d, 2)));
    }
}
// 그냥 int 값 받아서 a & b 해도 됨. 근데 비트연산이니까 2진수로 했다.
