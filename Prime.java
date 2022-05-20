import java.util.Scanner;
import java.util.ArrayList;
public class Prime {

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public Prime() {
        Scanner howMany = new Scanner(System.in);
        System.out.println(GREEN + "How many numbers do you want to filter?: " + RESET);
        int ans = howMany.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= ans; i++) {
            Scanner scannerNum = new Scanner(System.in);
            System.out.println(GREEN + "What is #" + i + "?" + RESET);
            int num = scannerNum.nextInt();
            numbers.add(num);
        }

        for (int i : numbers) {
            if (i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.print(YELLOW + i + " is prime. " + RESET);
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i != 1) {
                System.out.print(YELLOW + i + " is prime. " + RESET);
            }
        }
        Prime doAgain = new Prime(0);
    }
    public Prime (int diffConstructor) {
        Scanner again = new Scanner(System.in);
        System.out.println(GREEN + "Do you want to filter more numbers? (Type yes or no): " + RESET);
        String yesOrNo = again.nextLine();
        if (yesOrNo.equalsIgnoreCase("yes")) {
            Prime runAgain = new Prime();
        } else if (yesOrNo.equalsIgnoreCase("no")) {
            System.out.println(CYAN + "Thank you for filtering prime numbers!" + RESET);
        } else {
            System.out.println(RED + "Please enter a correct response." + RED);
            Prime doAgain = new Prime(0);
        }
    }
    public static void main(String[] args) {
        Prime intprime = new Prime();
    }
}