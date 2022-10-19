package javalion.week5.day2;

public class SquareStar {
// 정사각형 별 찍기
public void printSquare (int n) {  // printSquare 메소드를 통제할 파라미터 n
    for (int i = 0; i < n; i++) { // n-1번 반복(행의 개수)
        System.out.println("*".repeat(n));  // 한 행에 출력될 별의 개수는 n개(열의 길이)
    }
}
    public static void main(String[] args) {
        new SquareStar().printSquare(5);  // 5*5의 정사각형을 출력
    }
}
