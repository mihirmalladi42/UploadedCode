import java.util.Scanner;
public class StandardDeviation extends Colors{
    public static void calculate(boolean ifPopulation, double[] nums) {
            double mean = 0;
            double[] sequence = new double[nums.length];
            double[] sequenceMAD = new double[nums.length];
            double sum = 0;
            double sumMAD = 0;
            for (int i = 0; i < nums.length; i++) {
                mean += nums[i];
            }
            mean /= nums.length;
            for (int j = 0; j < nums.length; j++) {
                sequence[j] = Math.pow((nums[j] - mean), 2);
                sequenceMAD[j] = Math.abs(nums[j] - mean);
            }
            for (int k = 0; k < nums.length; k++) {
                sum += sequence[k];
                sumMAD += sequenceMAD[k];
            }
            if (ifPopulation) {
                int divide = nums.length;
                double res = Math.sqrt(sum / divide);
                double resMAD = sumMAD / divide;
                System.out.println("Standard Deviation: " + GREEN + res + RESET);
                System.out.println("Mean: " + GREEN + mean + RESET);
                System.out.println("Mean Absolute Deviation: " + GREEN + resMAD + RESET);
            } else if (!ifPopulation) {
                int divide = nums.length;
                double res = Math.sqrt(sum / (divide-1));
                double resMAD = sumMAD / divide;
                System.out.println("Standard Deviation: " + GREEN + res + RESET);
                System.out.println("Mean: " + GREEN + mean + RESET);
                System.out.println("Mean Absolute Deviation: " + GREEN + resMAD + RESET);
            }
        }
    public static void main(String[] args) {
        Scanner howManyNums = new Scanner(System.in);
        System.out.println("How many numbers do you want to calculate the Standard Deviation and Mean Absolute Deviation of?");
        int res = howManyNums.nextInt();
        double[] nums = new double[res];
        //howManyNums.close();
        for (int i = 0; i < res; i++) {
            Scanner num = new Scanner(System.in);
            System.out.println("What is number " + (i + 1) + "?");
            int numInt = num.nextInt();
            //num.close();
            nums[i] = numInt;
        }
        Scanner ifPopulation = new Scanner(System.in);
        System.out.println("Is the data population or sample? (Type 'true' if it is population and type 'false' if it is sample)");
        boolean ifOrNot = ifPopulation.nextBoolean();
        ifPopulation.close();
        calculate(ifOrNot, nums);
    }
}