import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {

        int[] arr1 = { 10, 20, 30, 40, 50 };
        int sum = 0;


        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }


        System.out.println("sum = " + sum);



        // [5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.

        int [][] arr = {
                { 5, 5, 5, 5, 5},
                { 10, 10, 10, 10, 10},
                { 20, 20, 20, 20, 20},
                { 30, 30, 30, 30, 30}
        };

        int total = 0;
        float avg = 0;

        for (int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                total += arr[i][j];
            }
        }
        avg = total / (float)(arr.length * arr[0].length);

        System.out.println("total = " + total);
        System.out.println("avg = " + avg);



        // [ 5 - 5 ]  다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프 로그램이다.
        // (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
        //[참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.

        int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ball3 = new int[3];


        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        for (int i = 0 ; i < ballArr.length; i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;

            System.out.println(Arrays.toString(ballArr));
        }
        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.

//        ball3 = Arrays.copyOf(ballArr, 3);
        //                 ballArr    [0] 에서 ball3   [0]으로      3개의 데이터를 복사.
        System.arraycopy(ballArr, 0, ball3, 0, 3);

        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }



        // [5-6]

        // 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다. 실행결과와 같이 동작하도록 예제의 빈 곳을 채우시오.

        String[] words = { "television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray(); // string 배열을 char 배열로 전환

            for (int j = 0; j < words.length ; j++) {  // 새로 생성된 배열의 이름은 question
                int idx = (int)(Math.random()* words.length); // idx 변수를 생성해 배열 index의 랜덤값을 받는다.

                char tmp = question[i];  // tmp에 배열 question의 0번째 인덱스의 값을 받는다.
                question[i] = question[idx]; // 배열 question의 인덱스 0에 랜덤값으로 생성된 변수 idx를 배열 인덱스에 넣고 그 값을 저장한다.
                question[idx] = tmp; // 랜덤으로 생성된 배열의 인덱스에 인덱스가 0 인 배열의 값을 저장한다.

            }  // 섞기 끝

            // 문제 내고                                              // question 객체 배열 생성
            System.out.printf("Q%d. %s의 정답을 입력하세요. > ", i + 1, new String(question));
            // 입력 받고
            String answer = scanner.nextLine();
            // true false 조건 설정한다. 만약에 배열 words와 일치하면 ture 아니면 false. 배열이 같은지 비교할때는 equals.
            if (words[i].equals(answer.trim())) { // trim 은 뭐냐?
                System.out.println("맞았습니다.");
            } else {
                System.out.println("틀렸습니다.");
            }
        }
    }
}

