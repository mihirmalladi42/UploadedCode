import java.util.Scanner;
public class TwentyDollarReal {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        System.out.println("How much money do you want to use?");
        double res = nums.nextDouble();
        compute(res);
    }
    public static void compute(double money) {
        int[] availDen = {20, 50, 100};
        int num20 = 0, num50 = 0, num100 = 0;
        boolean stop = false;
        while (!stop) {
            if (money % availDen[2] != 0 && money % availDen[1] != 0 && money % availDen[0] != 0 && money != 0) {
                money -= availDen[0];
                num20++;
            } else if (money % availDen[2] == 0 && money != 0) {
                money -= availDen[2];
                num100++;
            } else if (money % availDen[2] != 0 && money % availDen[1] == 0 && money % availDen[0] != 0 && money != 0) {
                money -= availDen[1];
                num50++;
            } else if (money < availDen[0]) {
                stop = true;
            }
        }
        System.out.println("$100: " + num100 + "\n$50: " + num50 + "\n$20: " + num20 + "\nLeftover: " + money);
        
    }
}