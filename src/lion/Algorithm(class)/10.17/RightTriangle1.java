package com.week5.day1;

// 별찍기

public class RightTriangle1 {

    private String Letter = "*";  //constructor를 통해 확장

    public RightTriangle1() {
    }

    public RightTriangle1(String letter) {
        this.Letter = letter;
    }

    public void printStar(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.printf(this.Letter);
            }
            System.out.printf("%n");
        }
    }

    public static void main(String[] args) {
        RightTriangle1 rightTriangle = new RightTriangle1();
        rightTriangle.printStar(20);
    }
}

// constructor를 이용하여 별이 아닌 # % $ 등으로 확장 가능

//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
