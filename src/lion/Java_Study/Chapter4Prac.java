import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Chapter4Prac {
    public static void main(String[] args) {


        // 4-2 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.

        int sum = 0;


        for (int num = 0 ; num <= 20; num++) {
            if (num%2 == 0 || num%3 ==0)
                continue;
            sum += num;
            System.out.println(sum);
        }


        // 4-3 1+(1+2)+(1+2+3)+ ... + (1+2+3+....+10)의 결과를 계산하시오.

        int sum = 0;
        int totalSum = 0;


        for (int i = 1 ; i <= 10; i++) {

            sum += i;
            totalSum += sum;
            System.out.println(totalSum);
        }

        // 4-4 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.

        int sum = 0;
        int s = 1;
        int num = 0;

        for(int i =1 ; true; i++, s= -s) { // i가 증가하고 -s 적용. i =2가 되었을떄 적용됨. 증감식 자리
            num = s * i;
            sum += num;
            System.out.println(num);
            if( sum >= 100)
                break;
        }
        System.out.println("num = " + num);
        System.out.println("sum = " + sum);




        //4-5 다음의 for문을 while문으로 변경하시오.

        for(int i=0; i<=10; i++) {
            for(int j=0; j<=i; j++)

            System.out.print("*");
            System.out.println();
        }

        int i = 0;

        while(i <= 10) {
            int j = 0;

            while(j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }



        // 4-6 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.

        for ( int i = 1 ; i <= 6; i++) {
            for (int j = 1; j <= 6 ; j++) {
                if (i + j == 6){
                    System.out.println(i + "+" + j + " = " + (i + j));
                }
            }
        }

        // 4-7 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
        // 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되 어야 한다. (1)에 알맞은 코드를 넣으시오.
        //[Hint] String클래스의 charAt(int i)을 사용

        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
           sum +=  str.charAt(i) - '0';

        }

        System.out.println("sum = " + sum);


        // 4-8 Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.
        // (1)에 알맞은 코드를 넣으시오.

        int value = (int)(Math.random()*6)+1;

        System.out.println("value : " + value);



        // 4-9  int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
        // 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)에 알맞은 코드를 넣으시오.
        //[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.

        int num = 12345;
        int sum = 0;

//        for (int i = 0 ; i < 5; i++) {
//            sum += num % 10;
//            num /= 10;
//        }

        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum = " + sum);





        // [4-10] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력 해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
        // 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
        // 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.
        // (1)~(2)에 알맞은 코드를 넣어 프 로그램을 완성하시오.

        int answer = (int)(Math.random()*100)+1;
        System.out.println(answer);
        int input = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            count++;
            System.out.println("1과 100 사이의 값을 입력하세요 : ");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 작은 수를 입력하세요");
            } else if (input < answer) {
                System.out.println("더 큰수를 입력하세요.");
            } else {
                System.out.println("맞혔습니다.");
                System.out.println("시도 횟수는 " + count + " 번 입니다.");
                break;
            }
        } while(true);
    }
}





