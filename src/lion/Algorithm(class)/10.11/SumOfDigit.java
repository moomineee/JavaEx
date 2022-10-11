package javalion.week4.day2;// sum of digit
// https://school.programmers.co.kr/learn/courses/30/lessons/12931?language=java
// 10월 11일 알고리즘 1회차 1번 문제

//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 	 2 + 3 = 6을 return 하면 됩니다.

public class SumOfDigit {

    public int solution(int n) {
        // %연산 이용 - 몫, 나머지
        // 5만원권 몇개 , 1만원권 몇개 > 이 알고리즘이랑 비슷
        int result = 0;
//        int origin = n;  // 공간복잡도를 줄이기 위해 origin 대신 n을 사용함

        // for 문으로 가능할까? no.. 된다 해도 힘들것.
        // while문을 써야

        // n/10 을 할때마다 어디에 저장할것인가? int origin에 저장.

//        // i = 0 일때,
//        System.out.println( n / 10); // 1234 / 10  몫 123
//        System.out.println( n % 10); // 나머지 4
//        // i = 1 일때,
//        System.out.println( n / 10); // 123 / 10  몫 123
//        System.out.println( n % 10); // 나머지 3

        // while 문
//        while (origin > 0) { // 공간복잡도를 줄이기 위해 origin = n 으로 바꾼다.
//            result += origin % 10;
//            origin = origin / 10;
        while ( n > 0 ) {
            result += n % 10;
            n = n / 10;

//            System.out.printf("origin : %d result : %d" , origin, result);
            System.out.printf("origin : %d result : %d\n" , n, result);
        }

        return result;
    }

    public static void main(String[] args) {
        SumOfDigit sod = new SumOfDigit();  // sum of digit였던 것.
        int result1 = sod.solution(1234);

        if (result1 == 10) {
            System.out.println("테스트 통과 했습니다.");
        } else {
            System.out.printf("테스트 실패 result :  %d \n", result1);
        }
    }
}
