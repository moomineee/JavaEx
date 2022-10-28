package javalion.week6.day5;

import java.util.HashSet;
import java.util.Set;

public class Ponketmon {
// 경우의 수 구하기

    public int solution(int[] nums) {
    Set<Integer> set = new HashSet<>(); // set을 쓴 이유. 중복을 없애기 위해 [3,2,1,2] -> [3, 2, 1]
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int N = nums.length / 2;

        // set의 개수와 N 중에서 하나를 리턴
        // length 6 -> N = 3은 [3,3,3,2,2,2]인 경우
        if (set.size() < N) {
            return set.size();
        } else {
            return N;
        }
    }

    public static void main(String[] args) {


    }
}
