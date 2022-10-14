package javalion.week4.day5;

import java.util.Arrays;

public class InsertionSort02 {

    // 변수를 메인메서드에서 파라미터로 자꾸 넘기는 이유.
    // 재귀(recursive) -- 반복문(while) 없이 반복해야할 경우에 사용. QuickSort에 사용. 속도는 logN. 엄청 빠르다.
                                            // 파라미터로 i 를 받게 만든다.
    public int[] sort(int[] arr, int i) {  // sort를 호출할 때 arr를 넘긴다. 메소드 설계(정렬 안된 arr을 받아 정렬된 arr을 리턴)
        // i = 1 arr[1] vs arr[0]
        // 지금 상황에서는 i = 2 일때 arr[2] (이건 j) vs arr[1] 만 비교
        //  i = 2 일때 arr[1] (j) vs arr[0] 도 비교해야한다.  -> loop를 떠올려야 한다.
        // j라는 변수가 추가 되어야 한다.
//        int j = i;  // j의 변화를 봐야한다. j는 하나씩 줄고 i는 그대로 있어야 한다. i는 위에서 받아오는데 바뀌는 곳이 없으니 고정. j는 루프를 돌면서 바꿔야함.
        for (int j = i ; j > 0 ; j--) {
            System.out.printf("i:%d j:%d j-1:%d\n",i ,j , j-1); // 반복이 어떻게 진행되는지 본다.

//        if (arr[j] < arr[j - 1]) { // arr[1] 과 arr[0]을 비교 0이 작을 경우 자리를 바꾼다.
//            //swap
//            int temp;
//            temp = arr[j-1];
//            arr[j-1] = arr[j];
//            arr[j] = temp;
//        }
        }
        return arr;  // 배열 arr을 메인 메서드로 반환한다.
    }

        public static void main(String[] args) {
        // 삽입정렬
        // 5에서 출발합니다.
        int[] arr = { 8, 5, 6, 2, 4 }; // 배열 arr 선언
        InsertionSort02 is = new InsertionSort02(); // 배열 객체 생성
        arr = new int [] {5, 8, 6, 2, 4}; // 자리 한번 바꾼 후의 배열
        int[] result = is.sort(arr, 2); // arr과 i를 파라미터로 넘기는 방식

        System.out.println(Arrays.toString(result));

    }
}
