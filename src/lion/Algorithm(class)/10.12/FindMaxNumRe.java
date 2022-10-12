package javalion.week4.day3;

// codeup 2081 최대값 구하기

// 배열이 음수로 존재할 경우

public class FindMaxNumRe {
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

    public int getMin(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1 ; i < arr.length; i++) {   // 0 -> 1로 바꿈
            System.out.println(arr[i]);
            if (arr[i] < maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 29, 38, 12, 57, 74, 40, 85, 61 };
        arr = new int[] { -3, -29, -38, -12, -57, -74, -40, -85, -61 };
        FindMaxNumRe findMaxNum = new FindMaxNumRe();
        int result  = findMaxNum.getMax(arr);

        if (result == -3) {     // 테스트 코드 작성
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.println("테스트 실패 입니다. result : " + result);
        }
    }
}

// Min Max 두개를 동시에 구하고 싶다. 그러면 어떻게 해야 할까?
// 복사. 근데 getMin 메서드는 Max 메서드에서 부호 하나 바뀌는 것.
// 이렇게 바꾸는 것은 기술부채를 발생시키는 일.
// 예를 들어 index를 구하는 것이 추가되면 Max Min 모두 추가 되어야 함. 타입도 바꿔줘야하고.
// -> human error의 발생 가능성. polymorphism을 이용하여 변형해보자.
// 리팩토링 하고 싶은 메서드를 카피한다.