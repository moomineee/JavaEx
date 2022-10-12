package javalion.week4.day3;

import java.util.Arrays;

public class MaxInMatrix {
    // arr을 받아서 최대값을 구해 int로 return.
    // return : maxValue, maxIdx
    public int getMax(int[] arr) {
        // loop 구성.
        int maxIdx = 0;
        int maxValue = arr[0];
        for (int i = 1 ; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[] {maxValue, maxIdx};
    }

    public static void main(String[] args) {
        int [][] arr = new int [][] {
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 1},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80},
        };
        // loop를 돌아야 함. 9 * 9
        int maxValue = arr[0][0];
        int[] maxIdx = { 0, 0 }; // 맥스값이 어디에 숨어있냐
        for (int i = 0 ; i < 9; i++) {
            for (int j = 0 ; j < 9; j++) {
//                    int a = arr[i][j]; // 1번   // j가 먼저 바뀐다. 가로 순회
                // j가 0~9까지 한번 돌면 i가 1씩 올라감. 이런걸 그려보고 접근하자
//                    int b = arr[j][i]; // 2번 세로 순회   둘중에 뭐가 맞을까?

//                    int nowValue = arr[i][j]; // 이건 가독성을 고려
//                    if (nowValue > maxValue) {
                  if (arr[i][j] > maxValue) {  // 이건 공간복잡성을 고려
                      maxValue = arr[i][j];
                      maxIdx[0] = i;
                      maxIdx[1] = j;
                }
            }
        }
        System.out.println(maxValue);
        System.out.println(Arrays.toString(maxIdx));
    }
}


// 여기서 다형성을 적용해보자
// 최소값을 구하는 알고리즘을 어떻게 만들까?  min.java
// 그럼 최대값과 최소값을 동시에 구하려면?