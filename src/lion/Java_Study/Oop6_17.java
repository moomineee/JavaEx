/*메서드명 : shuffle
기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다. 처리한 배열을 반환한다.
반환타입 : int[]
매개변수 : int[] arr - 정수값이 담긴 배열
*/

public class Oop6_17 {

                                              // 메서드의 선언부. 반환타입 + 메서드이름 + ( 매개변수 )
    public static int[] shuffle(int[] arr) {   // 여기 메서드 작성하는 부분이 아직 잘 안된다.
        if(arr==null || arr.length==0)  // 유효성 체크 - 반드시해야한다. 어떤 값이 넘어올지 모르니까.
            return arr;                 // 배열이 Null이거나 크기가 0이면 그대로 반환한다.

        for (int i = 0; i < arr.length; i++) {
            int n = (int)(Math.random()*arr.length);
            int tmp = 0;

            tmp = arr[i];
            arr[i] = arr[n];
            arr[n] = tmp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
