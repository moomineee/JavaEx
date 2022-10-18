package javalion.week5.day2;

public class SquareStar {

    public void printSquare (int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("***");
        }
    }

    public static void main(String[] args) {

        new SquareStar().printSquare(3);

    }
}
