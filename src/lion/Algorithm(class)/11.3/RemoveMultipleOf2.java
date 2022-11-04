package javalion.week7.day4;

import java.util.Arrays;

public class RemoveMultipleOf2 {

    public int solution(int N) {

        public static void main(String[] args) {

            int n = 50;

            int[] nums = new int[n-1];
            boolean[] checks = new boolean[nums.length];

            Arrays.fill(checks, true);

            for(int i = 0; i < nums.length; i++) nums[i] = i + 2;

            int multipleOf = 2;

            for(int i = multipleOf * 2; i < nums.length; i += 2) {
                checks[i] = false;
            }

            for(int i = 0; i<nums.length; i++) {
                if(checks[i]) System.out.println(nums[i]);
            }
        }
    }
}