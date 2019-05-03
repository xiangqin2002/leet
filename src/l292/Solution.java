package l292;

public class Solution {
    public boolean canWinNim(int n) {
        if(n % 4 == 0)
            return false;
        return true;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.canWinNim(1348820612));
    }
}
