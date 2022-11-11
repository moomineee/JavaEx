package javalion.week8.day5;

// 1. 10진수를 2진수로 변환 -> Integer.toBianryString()
// 2. 배열 2개 생성
// 3. 2진수로 변환한 수의 길이가 2^n-1보다 작을 경우(앞부분이 0으로 표시될 경우) 0으로 출력한다(공백이 아니라).
// 4. 두 배열을 비교해서 1을 #으로 바꾸고, 0을 공백(" ")으로 바꾼다. -> .replace

public class TreasureMap {

    String solution(int n, int[] arr1, int[] arr2) {

        String[] map = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            map[i] = Integer.toBinaryString(arr1[i]|arr2[i]);

        }
    return map;
    }
}
