package javalion.week5.day2;

import java.util.Scanner;

public class RecursiveStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Star(n);
    }
    static void Star(int n){

        if (n == 0) { // 재귀가 끝나는 조건 : Base case
            return ;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        Star(n-1);
    }
}