package javalion.week10.day1;

public class Recursion {
    public void print1To100(int num) {
        if (num > 100) {
            return;
        }
        System.out.println(num);
        print1To100(num + 1);
    }

    public static void main(String[] args) {
        print1To100(1);
    }

}
