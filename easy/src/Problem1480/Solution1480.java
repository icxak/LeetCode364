package Problem1480;

import java.util.Arrays;

public class Solution1480 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1, 1, 1, 1, 1})));
    }
        public static int[] runningSum(int[] nums) {
            int sum = 0;
            int[] res = new int[nums.length];
            for(int i = 0; i < nums.length; i++ ){
                sum += nums[i];
                res[i] = sum;
            }
            return res;
        }

}
