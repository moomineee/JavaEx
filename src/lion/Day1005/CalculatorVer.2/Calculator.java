//Calculator클래스를 만들고 plus minus multiple divide 4개의 메소드를 만들어보세요
//각 메소드 기능은 + - * /이고
//파라메터는 int a, int b 를 받습니다.
//CalculatorMain  클래스에서 실행 해보세요.
//DATA ACCESS OBJECT

//생성자 추가하고 매개변수 없애서, 변수를 한번만 할당해서 사칙연산 수행가능하게 코드 수정


public class Calculator {

    private int a;
    private int b;


    //생성자 추가  =   커맨드 + 인서트

//    public Calculator(int a, int b) {

    public Calculator() { // 생성자를 생성하여 메인메서드 간소화
        this.a = a;
        this.b = b;
    }


    public void plus() {
        System.out.println(a + b);
    }

    public void minus() {
        System.out.println(a - b);
    }
    public void multiple() {
        System.out.println(a * b);
    }
    public void divide() {
        float result = (float)a / b;
        System.out.println(result);
    }
}
