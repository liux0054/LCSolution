package medium.lc401tolc600;

public class LC553 {
    public String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder();
        if(nums.length == 1){
            return sb.append(nums[0]).toString();
        }else if(nums.length == 2){
            return sb.append(nums[0]).append('/').append(nums[1]).toString();
        }else{
            sb.append(nums[0] + "/(");
            for(int i=1; i<nums.length; i++){
                sb.append(nums[i]);
                sb.append("/");
            }
            sb.replace(sb.length()-1, sb.length(), ")");
            return sb.toString();
        }
    }
}
