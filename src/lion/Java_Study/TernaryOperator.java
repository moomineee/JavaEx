import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        int x , y , z ;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x;

        signX = x > 0 ? '+' : (x == 0 ? ' ' : '-');

        int num = 456;
        System.out.println(((int)(num/100))*100);

        int numOfApples = 123;
        int sizeOfBucket = 10;
        //int numOfBucket = (numOfApples/sizeOfBucket + 1);
        // 삼항연산자를 이용해 풀어보자
        // if 써서 조건문 추가하는 것 보다 훨씬 간편하다.

        int numOfBucket = ((numOfApples / sizeOfBucket) +
                (numOfApples/sizeOfBucket > 0 ? 1 : 0));

        System.out.println("필요한 바구니의 수 : " + numOfBucket);

        int a = 10;
        System.out.println(a > 0 ? '+' : (a < 0 ? '-' : '0'));

        int fh = 100;
        float celcius = (int)((5 / 9f * (fh - 32))*100 + 0.5f)/100f;  // 소수점 셋째자리에서 반올림
        System.out.println("Fh : " + fh);
        System.out.println("Cc : " + celcius);

    }



}

