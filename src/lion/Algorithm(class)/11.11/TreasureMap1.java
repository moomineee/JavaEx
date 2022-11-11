package javalion.week8.day5;

// 1. 10진수를 2진수로 변환 -> Integer.toBianryString()
// 2. 배열 2개 생성
// 3. 2진수로 변환한 수의 길이가 2^n-1보다 작을 경우(앞부분이 0으로 표시될 경우) 0으로 출력한다(공백이 아니라).
// 4. 두 배열을 비교해서 1을 #으로 바꾸고, 0을 공백(" ")으로 바꾼다. -> .replace

import java.util.Arrays;

public class TreasureMap1 {

    String getBinaryString(int n) {

        String answer = "";

        while (n > 0) {
            answer += n % 2; // answer는 String. n%2는 int. java에서 String + int 는 String
            n /= 2;
        }
        return answer;
    }

    String solution(int n, int[] arr1, int[] arr2) {
        String answer = "";
        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String binStr1 = getBinaryString(arr1[i]);
                String binStr2 = getBinaryString(arr2[i]);
                sArr1[i] = "0".repeat(n - binStr1.length()) + binStr1;
                sArr2[i] = "0".repeat(n - binStr2.length()) + getBinaryString(arr2[i]);
            }
        }
        System.out.println(Arrays.toString(sArr1));
        System.out.println(Arrays.toString(sArr2));
        return answer;
    }

    public static void main(String[] args) {
        TreasureMap treasureMap = new TreasureMap();
        var arr1 = new int[]{9, 20, 28, 18, 11};
        var arr2 = new int[]{30, 1, 21, 17, 28};
//        var r = treasureMap.solution()
//        System.out.println(r);

        System.out.println(Integer.toBinaryString(9));

    }
}