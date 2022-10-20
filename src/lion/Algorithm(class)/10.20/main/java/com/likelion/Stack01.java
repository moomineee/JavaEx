package com.likelion;

import java.util.ArrayList;

// push 구현
public class Stack01 {
    // Stack01 class의 멤버변수로 arr의 위치를 이동시킴
    private int[] arr = new int[10000];
//    private List<Integer> arl = new ArrayList<>();
    // List를 안쓰려고 하는 것. list.push를 하면 arr를 새로 만듬
    // new int[10000]을 싹다 카피한다. 10만개면 10만개. int를 잡아놨기 때문에 getArr로 개수를 알 수 없다.
    private int pointer = 0; // -1이면 empty. 0으로 출발하면 바로 쓸 수 있음.

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {    // push함수는 value를 받아 arr에 넣는기능.
        // arr에 1개씩 pointer를 늘리면서 넣기 위해 pointer++ 연산을 추가.
        // 시작을 -1에서 했다면 this.arr[idx] = value보다 pointer++를 먼저 쓴다.
        this.arr[this.pointer] = value;
        this.pointer ++;
    }

    public int pop() {  //팝은 맨 위에것만 보이기때문에 파라미터가 없다.
        int value = this.arr[this.pointer-1]; // 여기에서 오류가 발생한다. 왜? push 10 push20 하면 pointer가 2를 가리킴. 그래서 0이 나온다. 에러.
        this.pointer --;                       // 그래서 -1을 해줘야 한다.
        return value;
    }
    // push 10  >   push 20   point2
    // push를 할 때, this.pointer++를 하기 때문에 2개가 들어있으면 pointer는 2개가 된다. 하지만 실제 배열에는 아래와 같이 0번, 1번에만 들어있기 때문에
    // this.arr[this.pointer]로 접근한다면 0이 나온다. 0이 나오는 이유는 int[]는 초기값을 0으로 잡기 때문.
    public int[] getArr() {
        return arr;
    }
}
