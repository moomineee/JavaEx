package javalion.week8.day3;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int [] arr = new int[] {2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int i = 0;
        int minIdx = 0;
        int temp = 0;
        // i = 0일 때 arr[0]에 들어갈 최소값이 들어있는 idx 찾기

        for (i = 0; i < arr.length - 1; i++) {
            minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
        temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
