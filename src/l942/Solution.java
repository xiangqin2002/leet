package l942;

public class Solution {
    public int[] diStringMatch(String S) {
        int n = S.length();
        int[] res = new int[n + 1];

        int s = 0;
        int b = n;
        for(int i = 0; i < n; i++){
            if(S.charAt(i) == 'I')
                res[i] = s++;
            if(S.charAt(i) == 'D')
                res[i] = b--;
        }
        if(S.charAt(n - 1) == 'I')
            res[n] = s;
        else
            res[n] = b;
        return res;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        for(int i : s.diStringMatch("IDID"))
            System.out.println(i);
    }
}
