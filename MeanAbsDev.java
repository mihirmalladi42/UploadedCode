public class MeanAbsDev {
   public static void main(String[] args) {
       double[] nums = {4, 7, 3, 0, 1, 2, 2, 5};
       double mean = (nums[0] + nums[1] + nums[2] + nums[3] + nums[4] + nums[5] + nums[6] + nums[7]) / nums.length;
       double[] sequence = {Math.abs(nums[0] - mean), Math.abs(nums[1] - mean), Math.abs(nums[2] - mean), Math.abs(nums[3] - mean), Math.abs(nums[4] - mean), Math.abs(nums[5] - mean), Math.abs(nums[6] - mean), Math.abs(nums[7] - mean)}; 
       double sum = sequence[0] + sequence[1] + sequence[2] + sequence[3] + sequence[4] + sequence[5] + sequence[6] + sequence[7];
       double res = sum / nums.length;
       System.out.println(res);
   } 
}
