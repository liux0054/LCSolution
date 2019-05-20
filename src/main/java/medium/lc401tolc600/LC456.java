package medium.lc401tolc600;

public class LC456 {

    public boolean find132pattern(int[] nums) {
        int[] minTill = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for(int i=0; i<minTill.length; i++){
            minTill[i] = min;
            if(nums[i] < min) min = nums[i];
        }

        for(int j=1; j<nums.length-1; j++){
            for(int k=j+1; k<nums.length; k++){
                if(nums[k] > minTill[j] && nums[k] < nums[j]) return true;
            }
        }

        return false;
    }
}
