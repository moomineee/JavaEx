import java.util.Scanner;

public class CurrencyStep1 {
     public static void main(String[] args){

            int totalMoney;
            int quantity = 0;

            Scanner scanner = new Scanner(System.in);
            System.out.print("금액을 넣으세요:");

            totalMoney = scanner.nextInt();

            quantity = totalMoney / 50000;
            System.out.println("50000원" + quantity + "개");

            quantity = totalMoney % 50000 / 10000;
            System.out.println("10000원" + quantity + "개");

            quantity = totalMoney % 10000 / 5000;
            System.out.println("5000원" + quantity + "개");

            quantity = totalMoney % 5000 / 1000;
            System.out.println("1000원" + quantity + "개");

            quantity = totalMoney % 1000 / 500;
            System.out.println("500원" + quantity + "개");

            quantity  = totalMoney % 500 / 100;
            System.out.println("100원" + quantity + "개");

            quantity = totalMoney % 100 / 50;
            System.out.println("50원" + quantity + "개");

            quantity = totalMoney % 50 / 10;
            System.out.println("10원" + quantity + "개");

            scanner.close();
     }
}

