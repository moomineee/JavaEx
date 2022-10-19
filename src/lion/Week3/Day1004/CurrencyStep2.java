public class CurrencyStep2 {

    public static void main(String[] args) {

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10  = 10;

        int refund = 25700;

        System.out.printf("5만원권 (몫) : %d장, 나머지 : %d%n", refund / 50000, refund % 50000);
        // 25000원을 5만원으로 나누었을 때 몫과 나머지
        // 25,000원을 각 화폐 단위로 나누었을 때 몫과 나머지를 출력하는 코드를 작성
        // 각 화폐 단위는 위와 같이 각각 변수로 선언 할 것.
        System.out.printf("1만원권 (몫) : %d장, 나머지 : %d%n", refund / 10000, refund % 10000);
        //1만원짜리 두장을 처리하고 5천원이 나남는다.
//        refund = refund - (curr10000 * 2);
        // refund는 25000원을 1원으로 나눈 나머지로 값을 업데이트 한다.
        refund = refund % 10000; // modulo 나머지 mod% 위의 식이 이렇게 바뀌는 것.

        System.out.printf("5천원권 (몫) : %d장, 나머지 : %d%n", refund / 5000, refund % 5000);
        // 5천원권은 한장만 나오게 하고 싶다. 왜냐하면 25000원에서 2만원은 만원짜리 두개로 처리했기 때문.
        refund = refund % 5000;
        System.out.printf("1천원권 (몫) : %d장, 나머지 : %d%n", refund / 1000, refund % 1000);
        refund = refund % 1000;
        System.out.printf("5백원 (몫) : %d개, 나머지 : %d%n", refund / 500, refund % 500);
        refund = refund % 500;
        System.out.printf("백원 (몫) : %d개, 나머지 : %d%n", refund / 100, refund % 100);
        refund = refund % 100;
        System.out.printf("백원 (몫) : %d개, 나머지 : %d%n", refund / 100, refund % 100);
        refund = refund % 50;
        System.out.printf("오십원 (몫) : %d개, 나머지 : %d%n", refund / 50, refund % 50);
        refund = refund % 10;
        System.out.printf("십원 (몫) : %d개, 나머지 : %d%n", refund / 10, refund % 10);

    }
}
