package javalion.week8.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NumOfDivisionsPq {

    class solution {
        public int[] soution(int[] arr, int divisor) {

            PriorityQueue<Integer> list = new PriorityQueue<>();
            //array 순회
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    list.add(arr[i]);
                }
            }
        if (list.size() == 0) {
            return new int[] {-1};
        }
        // List를 Array로 바꾼다
        int[] answer = new int[list.size()];

        int idx = 0;
        while (!list.isEmpty()){
            answer[idx++] = list.poll();
        }
        return answer;
        }
    }

    public static void main(String[] args) {

    }
}
