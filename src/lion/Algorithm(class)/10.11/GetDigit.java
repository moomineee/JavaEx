package javalion.week4.day2;

// 자릿수 구하기

// 10월 11일 알고리즘 2번 문제

import java.util.Scanner;

public class GetDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        while (n > 0) {
            n = n / 10;
            cnt += 1;
        }
        System.out.println(cnt);
    }

}
