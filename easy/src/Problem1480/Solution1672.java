package Problem1480;

public class Solution1672 {

    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        int temp=0;
        for (int[] account : accounts) {
            for (int i : account) {
                temp += i;

            }
            if (temp > result) {
                result = temp;
            }
            temp = 0;

        }

        return result;
    }
}
