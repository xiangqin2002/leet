package l303;

public class NumArray {

    private int[] arr;

    public NumArray(int[] nums) {
        arr = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for(int k = i; k <= j; k++)
            sum += arr[k];
        return sum;
    }
}
