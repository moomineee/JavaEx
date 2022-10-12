package javalion.week4.day3;

// codeup 2081 최대값 구하기

// 배열이 음수로 존재할 경우

public class FindMaxNum1 {
    // arr을 받아 최대값을 구해서 int로 리턴
    public int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1 ; i < arr.length; i++) {   // 0 -> 1로 바꿈
            System.out.println(arr[i]);
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 29, 38, 12, 57, 74, 40, 85, 61 };
        arr = new int[] { -3, -29, -38, -12, -57, -74, -40, -85, -61 };
        FindMaxNum1 findMaxNum = new FindMaxNum1();
        int result  = findMaxNum.getMax(arr);

        if (result == -3) {     // 테스트 코드 작성
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트 실패 입니다. result : " + result);
        }
    }
}

// 이 로직에는 문제가 있다.
// 85가 마이너스가 아니면 테스트 통과
// 전부다 마이너스면? -3이 가장 큰 값인데 결과값이 0으로 나옴.
// 틀렸다. 왜? arr이 모두 음수인 경우 0으로 하면 0이 max
// 그럼 어떻게 수정해야 할까?
// int maxValue값을 0이 아니라 arr[0]으로 설정하면 해결!


// 근데 또 하나의 개선점이 있다?
// 루프를 1부터 시작
// int maxValue = arr[0] // 0값이 입력되니까 루프의 i를 1부터 시작하는 것
// 이럴 경우 620만 *620만의 데이터가 있다면 620만건의 데이터가 줄어드는 것.
//