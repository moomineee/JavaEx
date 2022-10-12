package javalion.week4.day3;

// codeup 2081 최대값 구하기

public class FindMaxNum {

    public int getMax(int[] arr) {
        int maxValue = 0;
        for (int i = 0 ; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 29, 38, 12, 57, 74, 40, 85, 61 };
        FindMaxNum findMaxNum = new FindMaxNum();
        int result  = findMaxNum.getMax(arr);

        if (result == 85) {     // 테스트 코드 작성
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트 실패 입니다. result : " + result);
        }
    }
}

// 이 로직에는 문제가 있다.