package javalion.week5.day2;

public class RectangleStar {
// 직사각형 별 찍기
    public void printRectangle (int x, int y) { // 직사각형은 가로와 세로의 길이가 다르므로 파라미터 두개 설정
        for (int i = 0; i < x; i++) { // 행의 길이는 x-1. 행의 별의 개수 = 세로길이
            System.out.println("*".repeat(y));// 열의 길이는 y-1. 열의 별의 개수 = 가로길이
        }                                     // repeat 함수로 이중반복문을 사용하지 않는다.
    }

    public static void main(String[] args) {
        new RectangleStar().printRectangle(3,4); // x, y값을 입력하여 출력
    }
}
