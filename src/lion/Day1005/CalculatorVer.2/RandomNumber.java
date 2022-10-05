//RandomCalculator를 만들어 보세요
//plus
//minus
//multiple
//divide
//
//각 메소드는 parameter를 int형 하나만 받습니다.
//ex) a + random한 정수 숫자 =
//
//randomNumber는 0~9사이의 정수
//
//plus a + randomNumber
//minus - randomNumber
//multiple * randomNumber
//divide / randomNumber  // 0으로 나누면 Error가 납니다. 에러처리
//랜덤한 숫자가 0으로 생성이 되면 “랜덤하게 생성된 숫자가 0입니다.” 가 출력되게

public class RandomNumber {
    private int a = 5;
    private int b = (int) (Math.random() * 10) + 1;


    public RandomNumber() {
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
        try {
            System.out.println((float)a / b);
        } catch (ArithmeticException e1) {
            if ( (a / b) == 0) {
                System.out.println("!ArithmeticException!");
            }
        }
        System.out.println((float)a / b);
    }

}
