interface Operation {
    int operation(int a, int b);
}

public class Gugudan {

    public void printGugudanTemplate(int dan, String operator, Operation Operator) {
        for (int i = 1; i <= 9; i++ ) {
            System.out.printf("%d * %d = %d\n" , dan, operator, i, dan * i);
        }
    }

    //다형성
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        for (int j = 2; j <= 9; j++) {
        }
    }
}