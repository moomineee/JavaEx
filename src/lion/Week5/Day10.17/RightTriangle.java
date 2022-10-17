package com.week5.day1;

// 별찍기

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");

        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();

        for (int i = 0; i < 4; i++) {
            for (int j = 1 ; j <= i + 1 ; j++) {
                System.out.print("*");
            }
            System.out.printf("%n");
        }

    }

}
