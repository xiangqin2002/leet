package l1002;

import java.util.List;

public class Solution {
    public List<String> commonChars(String[] A) {
        int[][] tem = new int[A.length][26];
        for(int i = 0; i < A.length; i++)
            tem[i] = hash(A[i]);

        for(int i = 0; i < A.length; i++){
//            for(int j = 0; j < 26; j++)
//            if(tem[i][j] != 0)
        }
        return null;
    }

    private int[] hash(String s){
        int[] ret = new int[26];
        for(int i = 0; i < s.length(); i++)
            ret[s.charAt(i) - 'a']++;
        return ret;
    }
}


