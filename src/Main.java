import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercise1 strInterface = str -> System.out.println(str);
        strInterface.printStr("Fantastic");
        System.out.println("------------------");

        Exercise2<Double> exercise2 = a -> {
            if (a % 2 == 0) {
                System.out.println(a + " Is odd number");
            } else {
                System.out.println();
            }
        };
        exercise2.oddNumber(22.);
        System.out.println("------------------");

        Exercise3<Integer> exercise31 = (a, b) -> System.out.println("a + b=" + (a + b));
        Exercise3<Integer> exercise32 = (a, b) -> System.out.println("a - b=" + (a - b));
        Exercise3<Integer> exercise33 = (a, b) -> System.out.println("a * b=" + (a * b));
        Exercise3<Integer> exercise34 = (a, b) -> System.out.println("a / b=" + (a / b));

        exercise31.miniCalculator(10, 5);
        exercise32.miniCalculator(10, 5);
        exercise33.miniCalculator(10, 5);
        exercise34.miniCalculator(10, 5);

    }
}
