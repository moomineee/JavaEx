package week.day3.collection2;


//알파벳 A ~ Z 까지 랜덤한 알파벳을 50개 생성하고 중복제거 해보세요.
//26 0~25

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabet {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();
        char alphabet = alphabetGenerator.generate(0);
        System.out.println(alphabet);

//        char alphabetA = 'A'; // 출력하는 다른 방법
//        char alphabet1 = (char)(alphabetA + 10);
//        System.out.println(alphabet1);

        Set<Character> characters = new HashSet<>();
        int cnt = 0;
        while (cnt < 100) {
            characters.add(alphabetGenerator.generate(0));
            cnt += 1;
        }
        System.out.println(characters);
        System.out.println(characters.size());
    }
}
