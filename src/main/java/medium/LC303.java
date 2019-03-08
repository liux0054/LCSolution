package medium;

public class LC303 {
    public static void main(String[] args){
        NumArray obj = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));
    }
}

class NumArray {
    int[] nums;
    int[] sums;
    
    public NumArray(int[] nums) {
       this.nums = nums;
       sums = new int[nums.length];
       sums[0] = nums[0];
       for(int i=1; i<nums.length; i++){
           sums[i] = sums[i-1] + nums[i];
       }
    }

    public int sumRange(int i, int j) {
       return i>=1 ? sums[j]-sums[i-1] : sums[j];
    }
}

