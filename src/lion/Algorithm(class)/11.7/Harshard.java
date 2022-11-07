package javalion.week8.day1;

public class Harshard {

    public boolean solution (int x) {

        int sumOfDigit = 0;
        while ( x > 0 ) {
            sumOfDigit += x % 10;
            x = x / 10;
        }

        System.out.println(sumOfDigit);

        return false;
    }

    public static void main(String[] args) {
        Harshard harshard = new Harshard();
        harshard.solution(459);
    }
}
