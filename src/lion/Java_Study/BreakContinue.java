import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

       //break 문

        int sum = 0;
        int i = 0;

        while(true) {
            if (sum > 100)
                break;

            sum += ++i;
        }
        System.out.println("i=" + i);
        System.out.println("sum=" + sum);



        // continue 문
        for (int i = 0; i <= 10; i++) {
            if (i%3 == 0)
                continue;
            System.out.println(i);
        }



        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴 (1~3)을 선택하세요. (종료 : 0) > ");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu || menu <= 3)) {
                System.out.println("번호를 잘못 입력하셨습니다.");
                continue;
            }
            System.out.println("선택하신 메뉴는 " + tmp + "번 입니다.");
        }



        // 계산기 추가 버전

        int menu = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        outer:
        while(true) {
            System.out.println("(1) Square");
            System.out.println("(2) Square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)을 입력하세요 : ");

            String str = scanner.nextLine();
            menu = Integer.parseInt(str);

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu || menu <= 3)) {
                System.out.println("번호를 잘못 입력하셨습니다.");
                continue;
            }

            for(; ;) {
                System.out.println("계산할 값을 입력하세요. (계산종료 : 0, 전체종료 : 99)");
                str = scanner.nextLine();
                num = Integer.parseInt(str);

                if (num == 0) {
                    System.out.println("계산을 종료합니다.");
                    break;
                } else if (num == 99) {
                    System.out.println("프로그램을 전체 종료합니다.");
                    break outer;
                }
                switch (menu) {
                    case 1:
                        System.out.println("reslut =" + num*num);
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                        break;
                }
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
