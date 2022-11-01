package javalion.week7.day2;

import java.util.Comparator;

// 인터페이스 적용
interface StatementStrategy {
    boolean compare (int a, int b); // 2개를 받아서 boolean을 return
}

public class TemplateCallbackFindPrimeNum {
// i < num
// i < num / 2
// i * i <= num  (=  Math.sqrt(num) 그런데 이 math.sqrt가 연산이 많으므로 i*i를 쓴다.)

    boolean isPrime(int num, StatementStrategy stmt) {
//        Comparator<Integer> comparator = (a, b) -> a + b;
        for (int i = 2; stmt.compare(i, num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        TemplateCallbackFindPrimeNum tcfp = new TemplateCallbackFindPrimeNum();
        boolean r = tcfp.isPrime(17, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a * a < b; //  b의 제곱근보다 작을때까지 실행
            }
        });
        System.out.println(r);
    }
}
