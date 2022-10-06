package week.day3.collectionmap;

import week.day3.collection2.AlphabetGenerator;

import java.util.HashMap;

public class AlphabetCnt1 {

    // 2. 이제 ascii 코드 표를 이용하여 대문자와 소문자를 필터링 하는 if 조건문 설정
    // boolean isAlphabet(char c)  — c가 알파벳인지 check하는 function
    // ascii code표에  대문자 65 ~ 90, 소문자 97~122 if((c >= 65 and c< 90) or ())

    // 3. Map<String, Integer> map = a~z까지 등록 해놓고 cnt를 1개씩 올린다.(대소문자 구별안함)

    public boolean isAlphabet(char ch) {
        if (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        AlphabetCnt alphabetCnt = new AlphabetCnt();

        String s1 = "aafajiel//:#*($eiiruqiow".toUpperCase();

        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for (char c = 'A'; c < 'Z'; c++) {
            alphabetMap.put(Character.valueOf(c), 0);
        }

        for (int i = 0; i < s1.length(); i++) {
//            char c = s1.charAt(i); < 이것만 쓰면 오류가 나는 이유
            // NullPointerExcep은 말그대로 Null(존재하지 않는값)을 참조할려고 했다는 것인데
            // 이 뜻은 alphabetMap 이라는 Map자료구조에 key값으로 존재하지 않는 것을 참조(.get()) 했다는 것.
            //
            //그래서 25번째 줄보면 a~z 뿐만아니라 / : 와 같은 특수기호도 있는데
            // 28번째 줄 for문을 통해 초기화된 alphabetMap은 A~Z만 key로 가지고 있기에
            // 32번째 for문에서 s1을 순회하면서 특수기호를 만나는 순간 발생한 에러
            // 따라서 아래와 같이 추가해줘야함.
            char c = Character.valueOf('A'); // 'A'와 같은 타입만 참조하겠다.
            System.out.println(c);
            System.out.println(c == 'A' );

            boolean isAlphabet = alphabetCnt.isAlphabet(c);
            if (isAlphabet) {
                alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }
        System.out.println(alphabetMap);
    }
}

