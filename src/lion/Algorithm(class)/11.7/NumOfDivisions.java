package javalion.week8.day1;

import java.util.Arrays;

public class NumOfDivisions {

    class solution {
        public int[] soution(int [] arr, int divisor) {

            int count = 0;
            int num = 0;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] % divisor == 0) {
                    count++;
                }
            }

            if (count == 0) {
                int [] answer = {-1};
                return answer;
            }

            int[] answer = new int[count];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    answer[num] = arr[i];
                    num++;
                }
            }
            Arrays.sort(answer);
            return answer;
        }
    }

    public static void main(String[] args) {

        NumOfDivisions numOfDivisions = new NumOfDivisions();
        
    }
}
