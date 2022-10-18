package javalion.week5.day2;

public class RectangleStar {
// 정사각형 별 찍기
    public void printRectangle (int x, int y) {
        // x 만큼 가로 , y만큼 세로
        for (int i = 0; i < y; i++) {
//            System.out.println("***");
            System.out.println("*".repeat(7));
        }
    }

    public static void main(String[] args) {

//        new RectangleStar().printRectangle(4);
        new RectangleStar().printRectangle(4, 7);

    }
}
