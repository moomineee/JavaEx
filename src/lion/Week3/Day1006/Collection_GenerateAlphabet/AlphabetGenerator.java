package week.day3.collection2;

public class AlphabetGenerator implements Generator<Character> {
    @Override
    public Character generate(int num) {
        int rndNum = (int) (Math.random() * 26);
        char alphabet = (char)(rndNum + 65); // 65 = 아스키코드로 A
        return alphabet;
    }
}
