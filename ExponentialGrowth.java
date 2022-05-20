import java.util.Scanner;

public class ExponentialGrowth {
    public static void main(String[] args) {
        Scanner vals = new Scanner(System.in);
        System.out.println("Enter the initial value, growth rate, and time interval (initial value is integer, growth rate is double, time interval is integer): ");
        int a = vals.nextInt();
        double r = vals.nextDouble();
        int x = vals.nextInt();
        System.out.println(calculate(a, r, x));
    }
    public static double calculate(int a, double r, int x) {
        return a * Math.pow((1 + r), x);
    }
}

