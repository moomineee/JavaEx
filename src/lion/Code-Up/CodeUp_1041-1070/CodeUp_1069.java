// 평가 입력받아 다르게 출력하기

import java.util.Scanner;

public class CodeUp_1069 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char ch = str.charAt(0);

        // 위에 두줄을 한줄로 줄이면
//        char ch = scanner.next().charAt(0);

        switch(ch) {
            case 'A' :
                System.out.println("best!!!");
                break;
            case 'B' :
                System.out.println("good!!");
                break;
            case 'C' :
                System.out.println("run!");
                break;
            case 'D' :
                System.out.println("slowly~");
                break;
            default :
                System.out.println("what?");
                break;
        }
    }
}

// switch 조건식 , break, default를 사용할 수 있냐.