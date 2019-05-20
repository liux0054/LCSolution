package easy.lc601tolc800;

public class LC665 {
    public boolean checkPossibility(int[] nums) {
       for(int i=0; i<nums.length-1; i++){
          if(nums[i] > nums[i+1]){
              if(i+2 < nums.length && nums[i] > nums[i+2]){
                  nums[i] = nums[i+1];
              }else{
                  nums[i+1] = nums[i];
              }
              break;
          }
       }

       int[] diff = new int[nums.length - 1];
       for(int i=0; i<nums.length-1; i++){
           diff[i] = nums[i+1] - nums[i];
       }

       for(int dif:diff){
           if(dif < 0){
               return false;
           }
       }
       return true;
    }
}
