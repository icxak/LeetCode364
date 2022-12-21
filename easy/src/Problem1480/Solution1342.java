package Problem1480;

public class Solution1342 {
    public int numberOfSteps(int num) {
        int res = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            res++;

        }

        return res;
    }
}
