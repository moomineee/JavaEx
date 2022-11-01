package javalion.week7.day2;

public class TemplateCallbackFindPrimeNum {
// i < num
// i < num / 2
// i * i <= num  (=  Math.sqrt(num) 그런데 이 math.sqrt가 연산이 많으므로 i*i를 쓴다.)

    boolean someOperation(int a, int b) {
        return a < b;
    }

    boolean isPrime(int num) {
        for (int i = 2; someOperation(i, num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        TemplateCallbackFindPrimeNum tcfp = new TemplateCallbackFindPrimeNum();
        boolean r = tcfp.isPrime(17);
        System.out.println(r);
    }
}
