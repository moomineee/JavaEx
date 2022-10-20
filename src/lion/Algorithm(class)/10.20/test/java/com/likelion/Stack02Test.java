package com.likelion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    @BeforeEach
    void setUp() {
        // ex) db에서 데이터를 지우는 코드 혹은 데이터를 insert 하는 코드를 넣는다.
        System.out.println("before each");
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void push() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr(); // int를 integer로 변경
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
        //.push
        //.getArr
    }

    @Test
    @DisplayName("pushAndPop")
    void pushAndPop() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
        // st.pop() 비어있을떄는? - pop이 안되는 기능을 넣어야 한다. = isEmpty
    }
}