package javalion.week8;

public class SumOfDigits {

    public int solution (int num) {

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }


    public static void main(String[] args) {

    }

}
