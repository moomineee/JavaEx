interface Operation {
    int operation(int a, int b);
}

public class GugudanKK {

    public void printGugudanTemplate(int dan, String operator, Operation operation) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, operator, i, operation.operation(dan, i));
        }
    }

    public void printPlusGugu(int dan) {
        printGugudanTemplate(dan, "+", (a, b) -> a + b);
    }

    public void printMultipleGugu(int dan) {
        printGugudanTemplate(dan, "*", (a, b) -> a * b);
    }
    // 다형성
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        for (int j = 2; j <= 9; j++) {
            gugudan.printMultipleGugu(j);
        }
    }
}
