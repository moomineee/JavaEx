package com.week5.day1;

// 별찍기

import java.util.Scanner;

public class RightTriangle {

    public void printStar(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }

    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.printStar(20);
    }
}

//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
