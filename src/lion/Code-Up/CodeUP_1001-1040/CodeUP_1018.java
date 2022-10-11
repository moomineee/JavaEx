import java.util.Calendar;
import java.util.Scanner;

public class CodeUP_1018 {
//어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
//참고
//scanf( ) 함수는 지정한 형식(format)에 따라 입력받는 함수이다.
//따라서, 입력받고자 하는 형식으로 표현해주면 된다.
//예시
//scanf("%d:%d", &h, &m); //콜론(:) 기호를 기준으로 두 수가 각 변수에 저장된다.

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        String str = Scanner.nextLine();

        System.out.printf(str);
//        Calendar time = Calendar.getInstance();
//        System.out.printf("%d:%d", time.get(Calendar.HOUR), time.get(Calendar.MINUTE));
    }
}



