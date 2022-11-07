package javalion.week8.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumOfDivisions1 {

    class solution {
        public int[] soution(int [] arr, int divisor) {

            List<Integer> list = new ArrayList<>();
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
        int[] answer = new int [list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        // sort 한 것을 return
        Arrays.sort(answer);
        return answer;
        }
    }

    public static void main(String[] args) {

    }
}
