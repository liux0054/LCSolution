package easy;

public class LC674 {
    public int findLengthOfLCIS(int[] nums) {
       if(nums == null || nums.length == 0){
           return 0;
       }

       int[][] length = new int[nums.length][2];
       length[0][0] = 0;
       length[0][1] = 1;
       for(int i=1; i<nums.length; i++){
           length[i][0] = Math.max(length[i-1][0], length[i-1][1]);
           if(nums[i] > nums[i-1]){
               length[i][1] = length[i-1][1] + 1;
           }else{
               length[i][1] = 1;
           }
       }
       return Math.max(length[nums.length-1][0], length[nums.length-1][1]);
    }
}
