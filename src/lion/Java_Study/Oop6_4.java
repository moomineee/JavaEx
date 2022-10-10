
class Oop6_4 {

    static double getDistance(int x, int y, int x1, int y1) { // 스태틱 변수로 설정했으므로 클래스 내에서는 전역변수.
        return Math.sqrt((x-x1) * (x-x1) + (y-y1) * (y-y1));
    }

    public static void main(String[] args) { // 하나의 클래스 안에 있으므로 스태틱 메서드를 통해 값을 받아올 수 있다.
        System.out.println(getDistance(1, 1, 2, 2));
        }
}