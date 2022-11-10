package javalion.week8.day4;

import java.util.ArrayList;

public class hateSameNum {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();

        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != num) {
                arrayList.add(arr[i]);
                num = arr[i];
            }
        }
        answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        
    }
}
