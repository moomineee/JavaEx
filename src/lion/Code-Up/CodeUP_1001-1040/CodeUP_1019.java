import java.util.Scanner;

public class CodeUP_1019 {
//(년, 월, 일)을 입력받아 / 지정된 형식으로 출력/하는 연습을 해보자.
//연, 월, 일이 ".(닷)"으로 구분되어 입력된다.
//입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
//(%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();

    String[] splitStr = str.split("\\.");

    int year = Integer.parseInt(splitStr[0]);
    int month = Integer.parseInt(splitStr[1]);
    int day = Integer.parseInt(splitStr[2]);

    System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}



