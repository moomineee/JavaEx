package javalion.week7.day3;

import java.util.ArrayList;

public class RemoveMultipleOf {
    // 50미만의 모든 소수 구하는 에라토스테네스의 체 알고리즘 짜는 순서.
    // 1. 2부터 50까지 숫자가 들어있는 49칸짜리 List 만들기
    // 2. 만든 List에서 2를 제외한 모든 2의 배수 지우기
    // 3. List에 있는 원소의 개수와 원소 출력 해보기 - 잘 지웠는지 확인
    // 3. ...
    // 4. 만든 List에서 7을 제외한 모든 7의 배수 지우기


    public static void main(String[] args) {
        int N = 50;
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 2; i <= N ; i++) { // 2~ 50 채우기
            nums.add(i);
        }
//        nums.removeIf(num -> num % 2 == 0 && num != 2);
        int sr = (int)Math.sqrt(N);
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % 2 == 0 && nums.get(i) > 2) { // 2의 배수인데 2는 제외
                nums.remove(i); // list에서 위의 조건에 해당하는 수를 제거하고 반환
            }
        }
        System.out.println(nums);
        System.out.println(nums.size() + "개");

        // 3의 배수 지우기 & 3 제외
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % 3 == 0 && nums.get(i) > 3) {
                nums.remove(i);
            }
        }
        System.out.println(nums);
        System.out.println(nums.size() + "개");

        // 4의 배수 지우기 & 4 제외
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % 4 == 0 && nums.get(i) > 4) {
                nums.remove(i);
            }
        }
        System.out.println(nums);
        System.out.println(nums.size() + "개");

    }

}
