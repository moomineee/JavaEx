package com.likelion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

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
            assertThrows(EmptyStackException.class, () -> {
                st.pop(); //outOfBoundExceoption 발생
            });
    }

    @Test
    void isEmpty() {                // stack이 비었을때는 True, 값이 들어 있으면 False, 값을 뺐을때 True
        Stack02 st = new Stack02();
        assertTrue(st.isEmpty());
        st.push(10);
//        boolean is isEmpty = st.isEmpty();
        assertFalse(st.isEmpty());
        st.pop();
        assertThrows(EmptyStackException.class, () -> { // Exception 예외의 검증
           st.pop();  // stack pop을 했을때 emptyStackException이 나면 여기서 검증한다.
        }); // 이 구간을 interface라고 생각하자
        assertTrue(st.isEmpty());

        new Interface01() {
            @Override
            public void runSth() {

            }
        };
    }

    @Test
    void realStack() {
        Stack<Integer> st = new Stack<>(); //  실제 stack 구현체는 어떻게 작동할 것인가?
        st.peek(); // 비었는데 peek하면 emptyStackException
        assertThrows(EmptyStackException.class, () -> {
            st.pop(); // 이렇게 하면 EmptyStackException. pop이 안된다. 왜? 스택이 비어있기 때문에
        });
    }

    @Test
    void peek() {  // pop과 비슷하지만 값을 확인만 할 뿐 값을 빼지는 않는다. stack의 맨 위에 있는 값을 이용해 특정 조건 처리를 할 경우 이용.
        Stack02 st = new Stack02();
        //stack이 비었는데 peek()하는 경우는?
        assertThrows(EmptyStackException.class, () -> {
            st.peek();
        });
        st.push(10);
        int peeked = st.peek();
        assertEquals(10,peeked);
    }
}