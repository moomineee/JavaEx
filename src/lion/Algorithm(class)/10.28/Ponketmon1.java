package javalion.week6.day5;

import java.util.HashSet;
import java.util.Set;

public class Ponketmon1 {
    // 경우의 수 구하기
    public int solution(int[] nums) {
        int answer = 0;
        int choosePonketmon = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        if(choosePonketmon >= set.size()) {
            answer = set.size();
        } else {
            answer = choosePonketmon;
        }
    return answer;
    }

    public static void main(String[] args) {

    }
}
