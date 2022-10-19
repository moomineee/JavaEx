package com.week5.day1;

// 피라미드 별찍기
// 직각삼각형은 *의 개수에만 신경쓰면 되지만, 피라미드는 *의 위치도 신경써야함.

public class Pyramid {

    public static void printStar(int n) {

        int N = 5;
        for (int i = 0; i < N; i++) {

            //공백 먼저 출력
            for (int j = N - 1 - i; j > 0; j--) { // j는 공백
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        Pyramid.printStar(5);
    }
}
