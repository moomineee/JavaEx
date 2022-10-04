package even_odd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 값을 두 개를 준다. 홀수, 짝수

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
