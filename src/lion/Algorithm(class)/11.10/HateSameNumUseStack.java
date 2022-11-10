package javalion.week8.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class HateSameNumUseStack {

    //Stack을 썼을때의 장점 : peek을 쑬 수 있다.
    // peek() vs answerList.get(answerList.sieze() -1 )
    // list.add보다 cost가 적다.

    // 단점 : 거꾸로 꺼내야 된다.

    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        var answer = new int[stack.size()];
        // 거꾸로 꺼내기
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        var arr = new int[] {1, 1, 3, 3, 0, 1, 1};
        HateSameNumUseStack hateSameNumUseStack = new HateSameNumUseStack();
        hateSameNumUseStack.solution(arr);
    }
}
