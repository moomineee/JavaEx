package com.likelion;

public class Stack02 {

    private Integer[] arr; // integer 타입의 경우 초기값이 0 이 아니라 null로 초기화 된다.
    private int top = 0;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        // 10을 넣으면 arr[0] = 10;
        this.arr[this.top++] = value;
//        this.top ++; // 0번이 들어오면 1번으로 올린다.
    }

    public int pop() {
        int value = this.arr[this.top-1];
        this.top --;
        return value;
//        return this.arr[--this.top];

    }
}
