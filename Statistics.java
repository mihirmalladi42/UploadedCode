import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Statistics {
    public static void median(int[] nums) {
        ArrayList<Integer> numsArr = new ArrayList<Integer>();
        int arrSize = numsArr.size();
        for (int i = 0; i < nums.length; i++) {
            numsArr.add(nums[i]);
        }
        Collections.sort(numsArr);
        double median;
        if (numsArr.size() % 2 != 0) {
            median = numsArr.get((numsArr.size()-1)/2);
            System.out.println("Median: " + median);
        } else if (numsArr.size() % 2 == 0) {
            double num1 = numsArr.get(numsArr.size() / 2);
            double num2 = numsArr.get((numsArr.size()-1) / 2);
            median = (num1+num2)/2;
            System.out.println("Median: " + median);
        }
    }
    public static void main(String[] args) {
        int[] nums = {5, 539, 53, 59, 9, 935, 9,9 ,35 };
        // 2 5 5 6 9 53 539 583          0 1 2 3 4 5 6 7
        median(nums);

        ArrayList<Integer> numsArrRange = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            numsArrRange.add(nums[i]);
        }
        Collections.sort(numsArrRange);
        double mean = 0;
        for (int j = 0; j < nums.length; j++) {
            mean += nums[j];
        }
        mean /= nums.length;
        System.out.println("Mean: " + mean);
        int range = numsArrRange.get(numsArrRange.size()-1) - numsArrRange.get(0);
        System.out.println("Range: " + range);
    }
}
