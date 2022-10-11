package javalion.week4.day2;
// 1이 될 때까지 더하기. while(n1 / 10 > 0)을 떠올릴 수 있는지를 검증하는 문제
// 앞에서 만든 solution method를 이용합니다.
// 목표: 몫, 나머지 연산과 while문의 조건을 떠올릴 수 있는지를 검증한다.
// 10월 11일 알고리즘 3번문제

public class GetSumToOne {

    public static void main(String[] args) {
        int n1 = 1234567;

        //1234567 = 28
        // 28 = 10
        // 1

        while (n1 / 10 > 0) {
            n1 = solution(n1);
            System.out.println(n1);
        }

        if (n1 == 1) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.printf("테스트 실패 result :  %d \n", n1);
        }
    }
}
