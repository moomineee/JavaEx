import java.util.Scanner;

public class MathRandom {
    public static void main(String[] args) {

        int num = 0;

        for (int i = 0; i <= 5; i++) {
            num = (int)(Math.random()*7) + 1;
            System.out.println(num);
        }



    }
}


