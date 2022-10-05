public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(20, 40);
        calculator.plus();
        calculator.minus();
        calculator.multiple();
        calculator.divide();

//        Calculator calculator = new Calculator();
//        calculator.plus(10, 20);
//        calculator.minus(50, 45);
//        calculator.multiple(6, 7);
//        calculator.divide(10, 20);
    }
}
