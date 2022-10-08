import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // 현재의 월을 입력해서 해당되는 계절을 출력
        Scanner scanner = new Scanner(System.in);
        System.out.print("현재의 월을 입력하세요. : ");
        int mon = scanner.nextInt();

        switch (mon) {
            case 12:
            case 1:
            case 2:
                System.out.println("현재 계절은 겨울 입니다.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("현재 계절은 봄 입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재 계절은 여름 입니다.");
                break;

            default:
                System.out.println("현재 계절은 가을 입니다.");


                // if문으로 변경

                if (mon == 12 || mon == 1 || mon == 2) {
                    System.out.println("현재의 계절은 겨울입니다.");
                } else if (mon == 3 || mon == 4 || mon == 5) {
                    System.out.println("현재의 계절은 봄 입니다.");
                } else if (mon == 6 || mon == 7 || mon == 8) {
                    System.out.println("현재의 계절은 여름 입니다.");
                } else {
                    System.out.println("현재의 계절은 가을 입니다.");
                }
        }
    }
}


