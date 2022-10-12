package javalion.week4.day3;
// Youtube 영상 보며 10번 복습
// Max, Min 구하기. FindMaxNum에서 출발. Max와 Min을 한번에 구하려면 어떻게 해야하는가.
// 메서드를 각각 추가하지 않고. 이러면 나중에 기술부채가 생긴다.

interface Compare {
    // doSomething  : 어떤것을 한다~ 라는 의미.
    boolean doSomething(int valueA, int valueB); //
}
public class MaxAndMin {

    private int getMaxOrMin(int[] arr, Compare compare) { //callback
        int targetValue = arr[0];
        for (int i = 1 ; i < arr.length; i++) {   // 0 -> 1로 바꿈
            System.out.println(arr[i]);
            boolean isSth = compare.doSomething(arr[i], targetValue);
            // max인 경우 : arr[i] > targetValue 일 때.
            // min인 경우 : arr[i] < targetValue 일 때.
            if (isSth) {
                targetValue = arr[i];
            }
        }
        return targetValue;
    }

    public int max(int[] arr) {
        return getMaxOrMin(arr, new Compare() {   //return 추가. 클래스 넣은 후에.
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public int min(int[] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 29, 38, 12, 57, 74, 40, 85, 61 };
        MaxAndMin maxAndMin = new MaxAndMin();
        int maxResult = maxAndMin.max(arr);
        int minResult = maxAndMin.min(arr);
        System.out.println(maxResult);
        System.out.println(minResult);
    }
}


// 리팩토링할 메서드 복사. psvm 생성. MaxAndMin maxAndMin = new MaxAndMin(); 입력
// getMax를 바꿀건데, (arr[i] > maxValue) 여기만 바꿔주면 된다.
// boolean isSth = arr[i] > maxValue; 추가. 이건 boolean이므로 true or false 반환
// 따라서 값이 t or f 에 따라 maxValue = arr[i]; (값을 바꿀지 안바꿀지 결정하는 것.
// 그래서 boolean isSth = arr[i] > maxValue; 이부분만 분리를 한다.

// isSth은 return value가 boolean. 따라서 boolean을 return하는 interface를 만들어주면 된다.
// interface는 arr[i] > maxValue 에서 arr[i]와 maxValue값 두개를 받고 boolean을 return하는 interface를 만들어주면된다.
// 이 interface를 MaxAndMin에서만 쓴다고 했을때 안쪽에 만드는 것도 나쁘지 않음.
// 반환타입 boolean , 어떤 것을 수행하는 doSomething 에 int type 변수 두개를 받아서 일을하는 인터페이스 선언
// 이 Interface 사용방법 두 가지.
// 1. 클래스 단위로 메소드를 만들어서 DI하는 방법
// 2. (간결) 메소드에 compare를 넘기는 것. interface 자체를 넘기는 것이다. 이걸 call back이라고 함.
//     getMax( 안에 interface를 넣는 것.)
// 다음으로 getMax 메서드 안의 boolean isSth을 doSomething으로 바꾼다.
// 그러면 메서드 이름이 getMax가 아니라 getMaxOrMin으로 바꿔 주어야 함.
// maxValue도 targetValue로 교체 (어떤 대상이 되는 값이다~)

// 이제 getMaxOrMin을 바로 사용하는 것이 아니고. (public이 아니라 private으로 전환)
// 밑에 max 하나 min 하나 만듦.
// public int max()는 arr를 받는다. 받아서 getMaxOrMin에 넘겨주기만 한다.
// 그래서 getMaxOrMin에 arr를 넘겨준다. 여기가 중요!
// interface의 구현체를 getMaxOrMin에 넣어줘야 되는데, 클래스를 만들지 않고 하려면
// (arr, new Compare() 입력. 밑에 오버라이딩 하면서 내부클래스가 쭉 생긴다.
// 내부클래스 생성 후 value만 바꿔준다.
// max이기 때문에, valueA가 arr. valueB는 targetValue. 따라서 valueA > valueB일 때 바꾸는 것.
// 이제 테스트를 해보자. 앞에서 썼던 int 배열을 main method로 가져오자.
//  maxAndMin.max(arr); arr을 넣으면 max값을 return. 그래서 이름이 maxResult.
//           결과값이 제대로 나오면?
// 이제 똑같이 min도 구현해보자.
// 얘도 getMaxOrMin을 return한다. arr, new Compare 입력하면, 고칠곳이 있음.
// false를 valueA < valueB;로.
// minResult 메소드도 구현해줘야된다.

// getMaxOrMin의 로직은 그대로 유지한 상태에서 max와 min 메소드의 valueA valueB의 대소값비교만 갈아 끼웠다.
// 근데 람다를 사용하면 더 간단해질 수 있다.