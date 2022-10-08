import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        // 숫자를 입력받아 0이면 입력하신 숫자는 0입니다.
        // 0이 아니면 입력하신 숫자는 0이 아닙니다. 출력

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 : ");
        int i = scanner.nextInt();

        if (i == 0) {
            System.out.println("입력하신 숫자는 " + i + "입니다.");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }



        // 성적에 따라 학점은 ABCD로 나누어 매기기.
        // 중첩 if 문으로 grade에 '+' '-' 추가하기.

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요 : ");
        int score = scanner.nextInt();
        char grade = ' '; // 기본값이 공백이 아니라 D로 주면 else 생략 가능.
        char opt = '0';
        System.out.println("당신의 점수는 " + score + "점 입니다.");

        if (score >= 90) {
            grade = 'A';
            if (score >= 97) {
                opt = '+';
            }
            else if (score > 93) {
                opt = '-';
            }

        } else {
            grade = 'B';
        }

        System.out.printf("당신의 학점은 %c%c 입니다.", grade, opt);
    }
}
    }
}

