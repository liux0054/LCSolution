package medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC152 {

    public int maxProduct(int[] nums) {
        int begin = 0;
        int ans = Integer.MIN_VALUE;
        boolean zeroExist = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                ans = Math.max(ans, getMaxProduct(Arrays.copyOfRange(nums, begin, i)));
                begin = i + 1;
                zeroExist = true;
            }
        }
        if(!zeroExist){
            ans = Math.max(ans, getMaxProduct(nums));
        }else{
            ans = Math.max(0, Math.max(ans, getMaxProduct(Arrays.copyOfRange(nums, begin, nums.length))));
        }
        return ans;
    }

    public int getMaxProduct(int[] nums){
        List<Integer> numsList = new ArrayList<>();
        boolean oneExist = false;
        for(int i:nums){
            if(i == 1){
                oneExist = true;
            }else{
               numsList.add(i);
            }
        }

        if(oneExist) numsList.add(1);
        int i =0;
        while(i<numsList.size()) {
            int j = i;
            if (numsList.get(i) == -1) {
                while (j < numsList.size() && numsList.get(j) == -1) {
                    j++;
                }
                j--;
                int numberOfMinusOne = j - i + 1;
                if (numberOfMinusOne > 3) {
                    if (numberOfMinusOne % 2 == 0) {
                        for (int k = 1; k <= numberOfMinusOne - 2; k++) {
                            numsList.remove(i + 2);
                        }
                        i = i + 2;
                    } else {
                        for (int k = 1; k <= numberOfMinusOne - 3; k++) {
                            numsList.remove(i + 3);
                        }
                        i = i + 3;
                    }
                }
                else{
                    i = i + numberOfMinusOne;
                }
            } else {
                i++;
            }
        }

        int[] product = new int[numsList.size()+1];
        product[0] = 1;
        for( i=0; i<numsList.size(); i++){
            product[i+1] = product[i] * numsList.get(i);
        }
        int ans = Integer.MIN_VALUE;
        for( i=1; i<product.length; i++){
            for(int j=i; j<product.length; j++){
                if(product[i-1] != 0 && product[j]/product[i-1] > ans){
                    ans = product[j]/product[i-1];
                }
            }
        }
        return ans;
    }
}
