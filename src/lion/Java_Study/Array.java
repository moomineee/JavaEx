import java.util.Arrays;

public class Array {
    public static void main(String[] args) {



        // 최대값 , 최소값을 구해라
        int [] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
                if (score[i] > max) {
                    max = score[i];
                } else if (score[i] < min) {
                    min = score[i];
                }
        }
        System.out.println(max);
        System.out.println(min);


        // shuffle

        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++){
            int n = (int)(Math.random()*10);
            int tmp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));




        // Lottery

        int[] lottery = new int[45];
        for (int i = 0; i < lottery.length; i++) {  // 배열에 1~45 저장
            lottery[i] = i + 1;  // 공은 번호가 1번부터 시작하니 + 1
        }

        int tmp = 0; // 두 값을 바꾸는데 사용할 변수
        int j = 0; // 임의의 값을 저장할 변수

        for (int i = 0; i < lottery.length; i++) { // 얼마나 섞을 거냐
            j = (int)(Math.random()*45); // 바꿀 공의 랜덤한 번호 생성

            tmp = lottery[i];   // 첫번째 공을 tmp에 저장.
            lottery[i] = lottery[j]; // 첫번째 공과 랜덤하게 돌려 나온 공을 바꾼다.
            lottery[j] = tmp; // 랜덤하게 돌려 나온 공을 다시 tmp에 저장.
        }

        for(int i = 0; i < 6; i++) {
            System.out.printf("%d번 공은 %d 입니다.%n", i, lottery[i]);
        }
    }
}
