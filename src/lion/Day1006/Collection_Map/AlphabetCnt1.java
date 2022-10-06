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
            char c = s1.charAt(i);
            boolean isAlphabet = alphabetCnt.isAlphabet(c);
            if (isAlphabet) {
                alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }
        System.out.println(alphabetMap);
    }
}

