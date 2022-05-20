import java.util.Scanner;

public class TrueCalculator {
    public static void output() {
        Scanner whatInp = new Scanner(System.in);
        System.out.println("What do you want to calculate? (No commas and only do +, -, *, or /): ");
        double num1 = whatInp.nextDouble();
        String operator = whatInp.next();
        double num2 = whatInp.nextDouble();
        whatInp.close();
        if (operator.equals("+")) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (operator.equals("/")) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        Scanner redo = new Scanner(System.in);
        System.out.println("Do you want to use the calculator again? (Yes or no):");
        String result = redo.nextLine();
        if (result.equalsIgnoreCase("yes")) {
            output();
        } else if (result.equalsIgnoreCase("no")) {
            System.out.println("Nice job checking your math.");
        }
        redo.close();
    }
    public static void main(String[] args) {
        output();
    }
}