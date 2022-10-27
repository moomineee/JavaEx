package javalion.week6.day4;

public class Marathon {
    
    // participant 배열과 completion 배열을 비교하여 없으면 리턴
    // 동명이인이 있다 -> hash 사용. 왜? 이름이 같으니까 배열의 인덱스로 동명이인 판별
    
    public String solution(String[] participant, String[] completion) {

        for (int i = 0; i < completion.length; i++) { // 완주자를 넣는다. 비교해야되니까.
          if(!participant.equals(completion)){ // 참가자와 완주자가 같지 않으면 = 참가자 명단에는 있는데 완주자 명단에 없으면 참가자 이름을 뱉는다.
                                               // 앞이 participant여야 된다.
            return participant[i]; // 인덱스 번호가 i인 참가자를 반환
          }
        }
        return participant[i];
    }

    public static void main(String[] args) {
        Marathon marathon = new Marathon();

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution);
    }
}
