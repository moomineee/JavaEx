package javalion.week4.day4;

import java.util.Arrays;

public class BubbleSort01 {
    // 오름차순 또는 내림차순으로 정렬하는 알고리즘을 짜보세요.

    public int [] sort(int[] arr, int i) {
//       for ( int i = 0; i < arr.length - 1; i++)
           for (int j = i + 1 ; j < arr.length ; j++ ) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
           }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 9, 28, 11};
        BubbleSort01 bubbleSort01 = new BubbleSort01();
        int[] result = bubbleSort01.sort(arr, 0);
        result = bubbleSort01.sort(new int[] {2, 7, 3, 9, 28, 11}, 1);
        System.out.println(Arrays.toString(result));
        result = bubbleSort01.sort(new int[] {2, 7, 3, 9, 28, 11}, 1);
        System.out.println(Arrays.toString(result));



    }
}