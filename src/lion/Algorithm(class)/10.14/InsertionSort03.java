package javalion.week4.day5;

import java.util.Arrays;

public class InsertionSort03 {
    // 이중 for문을 사용하여 loop 구성.
    public int[] sort(int[] arr) {  // i를 빼서 for에 넣는다 -> loop i 적용. 메인 메서드도 같이 수정
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {

        if (arr[j] < arr[j - 1]) {
            //swap
            int temp;
            temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            }
            }
        }
        return arr;  // 배열 arr을 메인 메서드로 반환한다.
    }
        public static void main(String[] args) {
        // 삽입정렬
        // 5에서 출발합니다.
        int[] arr = { 8, 5, 6, 2, 4 }; // 배열 arr 선언
        InsertionSort03 is = new InsertionSort03(); // 배열 객체 생성
        int[] result = is.sort(arr); // i를 loop에 넣었으므로 다시 빼준다.
        System.out.println(Arrays.toString(result));
    }
}
