package javalion.week7.day4;

import java.util.Arrays;

public class RemoveMultipleOfCheck {
// 2부터 50까지 숫자가 들어있는 Array 만들기
// 만든 Array크기의 checks배열을 만든다.
// 만든 Array대신 checks배열에 2를 제외한 모든 2의 배수에 false로 바꾸는 로직
// 소수만 출력 해보기: checks에 true인 nums[i]만 출력

// 아래를 출력할 수 있으면 80%는 풀어낸 것
// multipleof가 100까지
// 2, 2
// 3, 4
// 4, 6
// 5, 8
//for (int i = 0; i <= 98; i++) {
//            System.out.printf("%d, %d %n", i+2, i*2 + 2);
//        }
    public static void main(String[] args) {

        int N = 50;
        int[] nums = new int[N-1]; // N-1개 만큼 2~50까지 (총 49개)
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks 생성
        Arrays.fill(checks, true); // checks를 true로 초기화. 왜? 기본값이 false이기 때문
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;  // 2~50까지 nums에 채우기
        } // 여기까지가 문제 풀기 전 초기 세팅

        // 2의 배수 지우기
        // 0 1 2 3 4 5 6 7  8  9 10 11 12 13 14 15 16 17 18 19 20
        // 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
        int multipleOf = 2;
        for (int i = 2; i < nums.length; i+=2) {
            checks[i] = false;
        }
        for (int i = 2; i < nums.length; i++) {
            if (checks[i] != false) {
                System.out.printf("%d ", i);
            }
        }
        // checks를 참조해서 true인 값들만 nums[i]로 출력
    }
}
