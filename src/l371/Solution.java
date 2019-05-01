package l371;

import java.math.BigInteger;

public class Solution {
    public int getSum(int a, int b) {
        int jinwei = (a&b)<<1;
        int sum = a^b;
        if(jinwei != 0)
            return getSum(sum, jinwei);
        return sum;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.getSum(-1, 3));
    }
}
