package javalion.week7.day2;

public class PrimeNum {

    public static boolean isPrime (int num) { // 뭐가 static context?

        for (int i = 2; i < num; i++) { // 2부터
            if (num % i == 0) { // 나누어 떨어지면 소수가 X
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPrime(13)); // isPrime에서 왜 static을 써야함?
        System.out.println(isPrime(17));
        System.out.println(isPrime(19));
        System.out.println(isPrime(23));
    }
}
