package l476;

public class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        char[] ret = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            ret[i] = swap(s.charAt(i));
        }
        return cal(ret);
    }

    private char swap(char i){
        if(i == '0')
            return '1';
        return '0';
    }

    private int cal(char[] ret){
        int sum = 0;
        int len = ret.length - 1;
        for(int i = 0; i < ret.length; i++)
            System.out.println(ret[i]);
        for(int i = len; i >= 0; i--) {
            System.out.println(ret[i] - '0' + " " + Math.pow(2, len - i));
            sum += (ret[i] - '0') * Math.pow(2, len - i);
        }
        return sum;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.findComplement(5));
    }
}
