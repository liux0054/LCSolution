package easy.lc201tolc400;

public class LC303 {

}

class NumArray{
    int[] nums;
    int[] sums;

    public NumArray(int[] nums) {
        this.nums = nums;
        sums = new int[nums.length];
        if(this.nums != null && this.nums.length > 0){
            sums[0] = nums[0];
            for(int i=1; i<nums.length; i++){
                sums[i] = sums[i-1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if(i >= sums.length || j >= sums.length) {
            return 0;
        }
        return i>=1 ? (sums[j]-sums[i-1]) : sums[j];
    }
}
