package medium;

public class LC31 {
    public void nextPermutation(int[] nums) {
        for (int last = nums.length-1; last >= 1; last--) {
            if (nums[last] > nums[last-1]) {
                int temp = nums[last-1];
                nums[last-1] = nums[last];
                nums[last] = temp;
                return;
            }
        }
        int i=0;
        while (i < nums.length/2) {
            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
            i++;
        }
    }
}
