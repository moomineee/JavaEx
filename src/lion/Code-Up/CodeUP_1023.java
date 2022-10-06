import java.util.Scanner;

public class CodeUP_1023 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String f = scanner.next();

        String[] ff = f.split("\\.");
        String int1 = ff[0];
        String int2 = ff[1];

        System.out.println(int1);
        System.out.println(int2);

//        String s = scanner.next();
//        StringTokenizer st = new StringTokenizer(s, ".");
//
//        while (st.hasMoreElements()) {
//            System.out.println(st.nextToken());
// StringTokenizer를 이용해 출력. 하나의 구분자만 허용하므로 split이 더 유용할 듯 하다.
    }

}




