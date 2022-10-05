/*Calculator클래스를 만들고 plus minus multiple divide 4개의 메소드를 만들어보세요
각 메소드 기능은 + - * /이고
파라메터는 int a, int b 를 받습니다.
CalculatorMain  클래스에서 실행 해보세요.*/
//DATA ACCESS OBJECT
public class Calculator {

    public void plus(int a, int b){
        System.out.println(a + b);
    }

    public void minus(int a, int b){
        System.out.println(a - b);
    }
    public void multiple(int a, int b){
        System.out.println(a * b);
    }
    public void divide(int a, int b){
        float result = (float)a / b;
        System.out.println(result);
    }
}


//public class CalculatorMain {
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        calculator.plus(3, 3);
//        calculator.minus(23, 3);
//        calculator.multiple(34, 3);
//        calculator.divide(35, 36);
//    }
//}
