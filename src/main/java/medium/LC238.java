package medium;

public class LC238 {
    public int[] productExceptSelf(int[] nums) {
        int[] productLeft = new int[nums.length];
        int[] productRight = new int[nums.length];

        productLeft[0] = 1;
        productRight[nums.length-1] = 1;
        for(int i=1; i<nums.length; i++){
            productLeft[i] = productLeft[i-1] * nums[i-1];
        }

        for(int i=nums.length-2; i>=0; i--){
            productRight[i] = productRight[i+1] * nums[i+1];
        }

        int[] answer = new int[nums.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = productLeft[i] * productRight[i];
        }

        return answer;
    }
}
