package javalion.week6.day5;

import java.util.HashSet;

public class PhoneBook {
// 중첩 for문을 이용하여 전체 비교하면 복잡도가 O(N^2)
//
    public boolean solution(String[] phoneNums) {
        boolean answer = true;
        HashSet<String> hs = new HashSet<>();
        // hashset에서 한 개씩 뽑아서 12345678 검색
        // 1   -> 한번 검색시 O(N) 이걸 전화번호 숫자만큼 반복
        // 12
        // 123
        // ...
        // 12345678을 hashset에서 검색. 이렇게하면 O(N^2)아닌가? no. O(20N).
        // 왜? hash라도 배열의 전체는 한번 스캔해야함. = O(N)
        // 하나당 O(N)인데 이걸 20번 반복한다. 왜냐하면 전화번호 하나가 최대 20글자이기 때문.
        // 복잡도가 상수이면 Best.
        // 중첩 for문은 써야한다. 안쓰려고 하게 만드는 것이 함정.
        for(var phoneNum : phoneNums) hs.add(phoneNum); // var는 타입이 명백한 경우 사용. for(var  :   ) -> foreach 방식

        for(String phoneNum : phoneNums) {
            for (int i = 0; i < phoneNums.length; i++) {
                if(hs.contains(phoneNum.substring(0,i)));
                    answer = false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("123".indexOf("12")); // -1 반환
    }
}
