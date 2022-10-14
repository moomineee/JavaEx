package javalion.week4.day5;

import java.util.Arrays;

public class InsertionSort01 {

    public int[] sort(int[] arr) {  // sort를 호출할 때 arr를 넘긴다. 메소드 설계(정렬 안된 arr을 받아 정렬된 arr을 리턴)

        int i = 1;

        return new int[]{};
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
