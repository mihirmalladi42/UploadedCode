import java.math.BigDecimal;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner howMany = new Scanner(System.in);
        System.out.println("How many numbers of the Fibonacci Sequence do you want to see?");
        int res = howMany.nextInt();
        double num1 = 1;
        double num2 = 1;
        double num3 = 1;
        System.out.print("1, ");
        System.out.print("1, ");
        for (int i = 1; i <= res; i++) {
            num3 = num1 + num2;
            num2 = num1;
            num1 = num3;
            System.out.print(new BigDecimal(num1).toPlainString() + ", ");
        }
    }
}