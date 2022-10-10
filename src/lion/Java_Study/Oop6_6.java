

class MyPoint {
    int x;
    int y;

    MyPoint(){}
    MyPoint(int x, int y) {  // 생성자의 메서드명은 클래스와 일치해야 한다.
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1) {  // 6-4와는 다르게 스태틱 메서드가 아니므로, x, y값은 받을 필요가 없다.
                                          // 필요한 값인 x1과 y1만 받으면 되는 것.
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
    }
}


public class Oop6_6 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2 ,2)); // MyPoint에서 x,y값을 인스턴스 변수로 설정하였으므로
                                                        // getDistance에 스태틱 붙이면 안된다.
        }
    }

