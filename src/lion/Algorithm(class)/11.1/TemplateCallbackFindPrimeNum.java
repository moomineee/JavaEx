package javalion.week7.day2;

// 인터페이스 적용
interface StatementStrategy {
    boolean compare (int a, int b); // 2개를 받아서 boolean을 return
}
public class TemplateCallbackFindPrimeNum {
// 3개의 소수찾기 방법
// (1). i < num
// (2). i < num / 2
// (3). i * i <= num  (=  Math.sqrt(num) 그런데 이 math.sqrt가 연산이 많으므로 i*i를 쓴다.)
    boolean isPrime(int num, StatementStrategy stmt) { // interface를 parameter로 받는다.
        for (int i = 2; stmt.compare(i, num); i++) { //
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackFindPrimeNum tcfp = new TemplateCallbackFindPrimeNum();
        System.out.println(tcfp.isPrime(13, (a, b) -> a < b));  // 람다 왜 쓰나? 간편하니까.
        System.out.println(tcfp.isPrime(17, (a, b) -> a < b / 2));
        System.out.println(tcfp.isPrime(19, (a, b) -> a * a < b));
    }
}
