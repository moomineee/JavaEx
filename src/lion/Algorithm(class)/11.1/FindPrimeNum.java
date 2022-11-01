package javalion.week7.day2;

public class FindPrimeNum {
// 소수 찾기
// 2부터 자기 자신까지 나누어보는 방법. 나누어 떨어지는 수가 없으면 소수.
// 소수냐 아니냐 = boolean
// 시간복잡도는 O(N)

// Template callback pattern 적용 가능 -> 왜? i < num만 바뀌므로
// (1). 2부터 num까지 나누기
// (2). 절반만 나누기
// (3). num의 제곱근까지 나누기

    public boolean isPrime (int num) {

        for (int i = 2; i < num; i++) { // 2부터
            if (num % i == 0) { // 나누어 떨어지면 소수가 X
                return false;
            }
        }
        System.out.println(num + "은 소수");
        return true;
    }


    public static void main(String[] args) {
        FindPrimeNum primeNum = new FindPrimeNum();
        primeNum.isPrime(13);
        primeNum.isPrime(17);
        primeNum.isPrime(19);
        primeNum.isPrime(23);

    }
}
