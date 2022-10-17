package com.week5;

// 별찍기

public class RightTriangle {
    public static void main(String[] args) {

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");


        for (int i = 0; i < 4; i++) {
            for (int j = 4 ; j > i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
