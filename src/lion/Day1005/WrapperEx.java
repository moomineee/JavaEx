import java.math.BigInteger;
import java.util.ArrayList;

public class WrapperEx {
    public static void main(String[] args) {

        ArrayList<Integer> arr = null;

        Integer n1 = Integer.valueOf(5);
        Integer n2 = Integer.valueOf("1234");
//      (상동)int n2 = Integer.valueOf("1234"); << 이 형식을 제일 많이 쓴다.

        System.out.println("큰 수 : " + Integer.max(n1,n2));
        System.out.println("작은 수 : " + Integer.min(n1,n2));
        System.out.println("합 :  " + Integer.sum(n1,n2));

        System.out.println("2진수로 변환 :  " + Integer.toBinaryString(237489));
        System.out.println("8진수로 변환 :  " + Integer.toOctalString(237489));
        System.out.println("16진수로 변환 :  " + Integer.toHexString(237489));

        System.out.println("Int의 최대값 :  " + Integer.MAX_VALUE);
        System.out.println("Int의 최대값 :  " + Integer.MIN_VALUE);
        //9천경이 넘어갈 경우 ? Big Integer
        System.out.println("Long의 최대값 :  " + Long.MAX_VALUE);
        System.out.println("Long의 최소값 :  " + Long.MIN_VALUE);

        BigInteger big1 = new BigInteger("10000000000000000000");
        BigInteger big2 = new BigInteger("-9999999999999999999");

        BigInteger result = big1.add(big2); // big1+big2 는 안된다.
        System.out.println("결과 : " + result);

        result = big1.multiply(big2);
        System.out.println("결과 : " + result);
    }
}
