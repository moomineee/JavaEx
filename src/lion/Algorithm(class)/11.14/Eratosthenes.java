package javalion.week9;

import java.util.Arrays;

public class Eratosthenes {

    public static void main(String[] args) {

        int N = 50;
        int[] nums = new int[N-1];

        boolean[] checks = new boolean[nums.length]; // nums만큼 checks 생성
        Arrays.fill(checks, true); // 기본값 = false

        for (int i = 0; i < nums.length; i++) {
        nums[i] = i + 2;  // 2~50까지 nums에 채우기
        }

        int multipleOf = 2;
        for (int i = 2; i < nums.length; i+=2) {
            checks[i] = false;
        }
        for (int i = 2; i < nums.length; i++) {
            if (checks[i] != false) {
                System.out.printf("%d ", i);
            }
        }
    }
}
