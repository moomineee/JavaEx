package javalion.week8.day1;

public class Harshard {

    public boolean solution (int x) {

        int originX = x;

        // 자릿수 합
        int sumOfDigit = 0;
        while ( x > 0 ) {
            sumOfDigit += x % 10;
            x = x / 10;
        }

        System.out.println(sumOfDigit);

        // 자릿수 합으로 나누어 떨어지는지
        return originX % sumOfDigit == 0;
    }

    public static void main(String[] args) {
        Harshard harshard = new Harshard();
        harshard.solution(10);
    }
}
