package javalion.week10.day3;

public class Fibonacci {

    // 계산된 결과 값을 담을 배열
    private static int[] memo = new int[100];

    private static int fibo(int k) {
        if (memo[k] != 0) {
            // 이미 계산한 값
        } else {
            // 처음 계산되는 값
            if (k <= 2) {
                // 1번 항과 2번 항은 1로 초기화
                memo[k] = 1;
            } else {
                // 3번째 항 부터는 계산
                memo[k] = fibo(k - 1) + fibo(k - 2);
            }
        }
        return memo[k];
    }

    public static void main(String[] args) {
        fibo(99);

        for (int n : memo) {
            System.out.print(n + " ");
        }
    }
}
