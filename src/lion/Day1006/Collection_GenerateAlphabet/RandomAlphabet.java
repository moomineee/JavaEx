package week.day3.collection2;


//알파벳 A ~ Z 까지 랜덤한 알파벳을 50개 생성하고 중복제거 해보세요.
//26 0~25

public class RandomAlphabet {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();
        char alphabet = alphabetGenerator.generate(0);
        System.out.println(alphabet);

        char alphabetA = 'A';
        char alphabet1 = (char)(alphabetA + 10);
        System.out.println(alphabet1);

    }
}
