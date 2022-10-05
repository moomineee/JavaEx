public class CalculatorMain {
    public static void main(String[] args) {
        Calculator userDao = new Calculator();
        userDao.plus(10, 20);
        userDao.minus(50, 45);
        userDao.multiple(6, 7);
        userDao.divide(10, 20);
    }
}
