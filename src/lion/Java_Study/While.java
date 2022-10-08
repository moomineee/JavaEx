import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int i = 5;

        while(i!=0) {
            i--;
            System.out.println(i + " - i can do it");

        }

        //1부터 몇까지 더해야 100을 넘지 않는가.

        int sum = 0;
        int i = 0;

        while (sum < 100) {
            sum += ++i;

            System.out.println(i + "까지 더하면 " + sum + "입니다.");
        }


        //사용자로부터 숫자를 입력받고, 이 숫자의 각 자리의 합을 구하는 예제

        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = scanner.nextInt();
        System.out.println("입력받은 값은" + num + "입니다.");

        //10으로 나누면 나머지를 저장하고, int 형 타입이기 때문에 한자리씩 사라진다. 반올림도 없음.
        while (num != 0) {
            sum += num%10;
            System.out.println("sum = " + sum + " num = " + num);
            num /= 10; // 한자리씩 없애줘야된다.
        }
        System.out.println("각 자리수의 합은 : " + sum);



        // do - while 문. 스무고개

        Scanner scanner = new Scanner(System.in);
        int num = (int)(Math.random()*100) + 1;
        int uNum = 0;

        do {
            System.out.print("1과 100 사이의 정수를 입력하세요 : ");
            uNum = scanner.nextInt();

            if (uNum > num) {
                System.out.println("더 작은 수를 입력하세요.");
            } else if (uNum < num) {
                System.out.println("더 큰 수를 입력하세요.");
            }

        } while(uNum != num);

        System.out.println("정답입니다.");
    }
}

