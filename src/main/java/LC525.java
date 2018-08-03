public class LC525 {

    public int findMaxLength(int[] nums) {
        if(nums.length == 0) return 0;
        int[] zerotill = new int[nums.length];
        int[] onetill = new int[nums.length];
        if(nums[0] == 0){
            zerotill[0] = 1;
        }else{
            onetill[0] = 1;
        }

        for(int i=1; i<nums.length; i++){
            if(nums[i] == 0){
                zerotill[i] = zerotill[i-1]+1;
                onetill[i] = onetill[i-1];
            }else{
                onetill[i] = onetill[i-1]+1;
                zerotill[i] = zerotill[i-1];
            }
        }

        for(int l=nums.length; l>=2; l--){
            for(int start=0; start<=nums.length-l; start++){
                int end = start + l-1;
                int numberOfZeros=0;
                int numberOfOnes=0;
                if(start==0){
                    numberOfOnes = onetill[end];
                    numberOfZeros = zerotill[end];
                }else{
                    numberOfOnes = onetill[end] - onetill[start-1];
                    numberOfZeros = zerotill[end] - zerotill[start-1];
                }
                if(numberOfOnes == numberOfZeros) return numberOfOnes + numberOfZeros;
            }
        }
        return 0;
    }
}
