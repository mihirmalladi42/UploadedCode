import java.util.Scanner;
public class Calculator {
    
    public Calculator() {
        Scanner whatOperation = new Scanner(System.in);
        System.out.println("What operation do you wish to do? (addition, subtraction, division, multiplication, power)");
        String answer = whatOperation.nextLine();
        if (answer.equalsIgnoreCase("addition")) {
            Calculator addition = new Calculator(5);
        } else if (answer.equalsIgnoreCase("subtraction")) {
            Calculator subtraction = new Calculator(5.5);
        } else if (answer.equalsIgnoreCase("multiplication")) {
            Calculator multiplication = new Calculator(true);
        } else if (answer.equalsIgnoreCase("division")) {
            Calculator division = new Calculator('c');
        } else if (answer.equalsIgnoreCase("power")) {
            Calculator power = new Calculator(4, true);
        } else {
            System.out.println("Please enter a correct response.");
            Calculator again = new Calculator();
        }
    }
    public Calculator(String diffConstructor) {
        Scanner doAgain = new Scanner(System.in);
        System.out.println("Do you want to use the calculator again? (Yes or no):");
        String ans = doAgain.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            Calculator again = new Calculator();
        } else if (ans.equalsIgnoreCase("no")) {
            System.out.println();
            System.out.println("Thank you for using the calculator.");
        } else {
            System.out.println();
            System.out.println("Please enter a correct response");
            System.out.println();
            Calculator repeat = new Calculator("Do Again");
        }
    }
    public Calculator(int diffConstructorAddition) {
        Scanner whatNums1 = new Scanner(System.in);
        System.out.println();
        System.out.println("What is number 1?");
        System.out.println();
        int num1 = whatNums1.nextInt();
        
        Scanner whatNums2 = new Scanner(System.in);
        System.out.println();
        System.out.println("What is number 2?");
        System.out.println();
        int num2 = whatNums2.nextInt();
        int sum = num1 + num2;
        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println();
        Calculator repeat = new Calculator("Next");
    }
    public Calculator(double diffConstructorSubtraction) {
        Scanner whatNums1 = new Scanner(System.in);
        System.out.println();
        System.out.println("What is number 1?");
        System.out.println();
        int num1 = whatNums1.nextInt();
        
        Scanner whatNums2 = new Scanner(System.in);
        System.out.println();
        System.out.println("What is number 2?");
        System.out.println();
        int num2 = whatNums2.nextInt();
        int difference = num1 - num2;
        System.out.println();
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println();
        Calculator repeat = new Calculator("Next");
    }
    public Calculator(boolean diffConstructorMultiplication) {
        Scanner whatNums1 = new Scanner(System.in);
        System.out.println();
        System.out.println("What is number 1?");
        System.out.println();
        int num1 = whatNums1.nextInt();
        
        Scanner whatNums2 = new Scanner(System.in);
        System.out.println();
        System.out.println("What is number 2?");
        System.out.println();
        int num2 = whatNums2.nextInt();
        int product = num1 * num2;
        System.out.println();
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println();
        Calculator repeat = new Calculator("Next");
    }
    public Calculator(char diffConstructorDivision) {
        Scanner whatNums1 = new Scanner(System.in);
        System.out.println();
        System.out.println("What is the dividend?");
        System.out.println();
        int num1 = whatNums1.nextInt();
        
        Scanner whatNums2 = new Scanner(System.in);
        System.out.println();
        System.out.println("What is the divisor?");
        System.out.println();
        int num2 = whatNums2.nextInt();
        double quotient = num1 / num2;
        System.out.println();
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println();
        Calculator repeat = new Calculator("Next");
    }
    public Calculator(int diffConstuctorPower, boolean diffConsturctorP2) {
        Scanner whatNums1 = new Scanner(System.in);
        System.out.println();
        System.out.println("What is the base?: ");
        System.out.println();
        int num1 = whatNums1.nextInt();
        
        Scanner whatNums2 = new Scanner(System.in);
        System.out.println();
        System.out.println("What is the exponent?:");
        System.out.println();
        try {
            int num2 = whatNums2.nextInt();
            System.out.println();
            System.out.println(num1 + " to the power of " + num2 + " = " + Math.pow(num1, num2));
            System.out.println();
            Calculator repeat = new Calculator("Next");
        } catch (Exception e) {
            System.out.println();
            System.out.println("Enter an integer");
            Calculator repeat = new Calculator(4, false);
        }
    }
    public static void main(String[] args) {
        Calculator addition = new Calculator();
    }
}
