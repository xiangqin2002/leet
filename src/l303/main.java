package l303;

public class main {
    public static void main(String[] args){
        int[] arr = {-2, 0, 3, -5, 2, -1};
        NumArray na = new NumArray(arr);
        System.out.println(na.sumRange(0, 5));
    }
}
