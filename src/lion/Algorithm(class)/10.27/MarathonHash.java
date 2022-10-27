package javalion.week6.day4;

import java.util.HashMap;
import java.util.Map;

public class MarathonHash {

    // participant 배열과 completion 배열을 비교하여 없으면 리턴
    // 동명이인이 있다 -> hash 사용. 왜? 이름이 같으니까 배열의 인덱스로 동명이인 판별
    // 일단 찾는 로직 구현하고, 여기서 hash를 사용하는 방법으로

    // 1. hashmap memo에 participant를 모두 넣는다.
    // 2. completion에 들어 있는 이름을 key로 Hashmap에 검색. 있으면 0으로 체크.
    // 3. memo를 한바퀴 돌면서 1인 값을 찾는다.
    // 4. participant에 1명 남으면 return.

    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> memo = new HashMap<>(); // hash맵 메모 선언

        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            memo.put(key,1);
        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i];
            memo.put(key, 0);
        }
        for(String key : memo.keySet()) {
            if(memo.get(key) == 1) { //완주하지 못한 선수
                return key;
        }
    }

    public static void main(String[] args) {
        MarathonHash marathon = new MarathonHash();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution);
    }
}
