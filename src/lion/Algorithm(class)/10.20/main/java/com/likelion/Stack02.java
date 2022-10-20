package com.likelion;

import java.util.EmptyStackException;

public class Stack02 {

    private Integer[] arr; // integer 타입의 경우 초기값이 0 이 아니라 null로 초기화 된다.
    private int top = 0; // stack이 처음 초기화 되었을때 0

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

    public int pop() {  // 비어있는 stack에 pop()을 하는 경우 예외처리를 해야한다.
        if ( this.isEmpty()) {    // 비었는데 pop 하는 경우의 exception 처리.
//            throw new RuntimeException("스택이 비었습니다.");
            throw new EmptyStackException(); // .pop()에서 Stack이 비었을 때 Exception처리
        }
//        int value = this.arr[this.top-1];
//        this.top --;
//        return value;
        return this.arr[--this.top]; // this.pop이 -가 나오면 안되기 때문에(-1 ArrayOutOfIndexException이 발생하기 때문)
    }                                // stack이 비어있을 때는 에러를 throw해서 더 이상 진행이 되지 않도록 만든다.

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }
}
