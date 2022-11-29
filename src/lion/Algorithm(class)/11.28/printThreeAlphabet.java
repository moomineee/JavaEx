package javalion.week11.day1;

public class printThreeAlphabet {

    void twoLetter(){

        for (int ascii1 = 65; ascii1 < 91; ascii1++) {
            for (int ascii2 = 65; ascii2 < 91; ascii2++) {
                System.out.printf("%c %c \\n",(char) ascii1, (char) ascii2);
            }
        }
    }

    public static void main(String[] args) {

    }
}
