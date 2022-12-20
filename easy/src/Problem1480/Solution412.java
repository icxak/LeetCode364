package Problem1480;

import java.util.ArrayList;
import java.util.List;

public class Solution412 {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
               res.add(FizzBuzz(i));
        }
        return res;
    }

    public static <T> T FizzBuzz(int i) {

        if (i % 3 == 0 && i % 5 == 0) {
            return (T) "FizzBuzz";
        }
        if(i % 3 ==0){
            return (T)"Fizz";
        }
        if(i % 5 == 0){
            return (T)"Buzz";
        }else{
            return (T)(""+ i);
        }
    }
}
