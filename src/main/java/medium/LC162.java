package medium;

public class LC162 {
    public int findPeakElement(int[] nums) {
        return findPeakIndex(nums, 0, nums.length-1);
    }

    private int findPeakIndex(int[] nums, int start, int end) {
        if (start == end) {
            return start;
        }
        int mid = (start + end) / 2;
        if (nums[mid] > nums[mid+1]) {
            return findPeakIndex(nums, start, mid);
        } else {
            return findPeakIndex(nums, mid+1, end);
        }
    }
}

