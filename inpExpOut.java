import java.util.*;
class inpExpOut extends Colors{
    public static void main(String []args) {
        System.out.println("Type how many inputs you want first. Then, type the three numbers");
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[] nums;
        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int exp = 1;
            nums = new int[n];
            nums[0] = a + b;
            System.out.print(GREEN + nums[0] + " " + RESET);
            for (int j = 1; j < n; j++) {
                exp *= 2;
                nums[j] = nums[j-1] + exp*b;
                System.out.print(GREEN + nums[j] + " " + RESET);
            }
            System.out.println();
        }
        in.close();
    }
}