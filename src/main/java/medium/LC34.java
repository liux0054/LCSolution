package medium;

public class LC34 {
    public int[] searchRange(int[] nums, int target) {
        return nums.length == 0 ? new int[]{-1, -1} : search(nums, target, 0, nums.length-1);
    }
    
    private int[] search(int[] nums, int target, int start, int end) {
        if (start == end) {
            return nums[start] == target ? new int[] {start, start} : new int[] {-1, -1};
        } else {
            int[] initialPosition = new int[] {-1, -1};
            int mid = (start + end)/2;
            if (nums[mid] == target) {
                initialPosition[0] = mid;
                initialPosition[1] = mid;
                int[] posFromLeft = search(nums, target, start, mid);
                int[] posFromRight = search(nums, target, mid + 1, end);
                if (posFromLeft[0] != -1) { 
                    initialPosition[0] = posFromLeft[0];
                } else if (posFromLeft[1] != -1) {
                    initialPosition[1] = posFromLeft[1];
                }
                
                if (posFromRight[1] != -1) {
                    initialPosition[1] = posFromRight[1];
                } else if (posFromRight[0] != -1){
                    initialPosition[1] = posFromRight[0];
                }
                
                return initialPosition;
            } else {
                if (nums[mid] > target) {
                    return search(nums, target, start, mid);
                } else {
                    return search(nums, target, mid+1, end);
                }
            }
        }
    }
}
