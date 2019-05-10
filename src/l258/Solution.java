package l258;

public class Solution {
    public int addDigits(int num) {
        int t = num % 10;
        int sum = 0;
        while (num / 10 > 0){
            sum += t;
            num /= 10;
            t = num % 10;
            System.out.println(t);
            if(num / 10 == 0 && sum + num > 9) {
                num = sum + num;
                t = num % 10;
                sum = 0;
            }
        }
        return sum + num;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.addDigits(38) + " d");
    }
}
