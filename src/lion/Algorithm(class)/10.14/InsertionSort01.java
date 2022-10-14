package javalion.week4.day5;

import java.util.Arrays;

public class InsertionSort01 {

    public int[] sort(int[] arr) {  // sort를 호출할 때 arr를 넘긴다. 메소드 설계(정렬 안된 arr을 받아 정렬된 arr을 리턴)

        int i = 1;
        if (arr[i] < arr[i - 1]) { // arr[1] 과 arr[0]을 비교 0이 작을 경우 자리를 바꾼다.
            //swap
            int temp;
            temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;

        }
        return arr;
    }
        public static void main(String[] args) {
        // 삽입정렬
        // 5에서 출발합니다.

        int[] arr = { 8, 5, 6, 2, 4 }; // 배열 arr 선언
        InsertionSort01 is = new InsertionSort01(); //
        int[] result = is.sort(arr);

        System.out.println(Arrays.toString(result));

    }
}
