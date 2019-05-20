package easy.lc1tolc200;

import java.util.ArrayList;
import java.util.List;


public class LC123 {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 1 || prices.length == 0){
            return 0;
        }

        int[] diff = new int[prices.length];
        for(int i=0; i<prices.length-1; i++){
            diff[i] = prices[i+1] - prices[i];
        }

        List<Integer> sums = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<diff.length; i++){
            if(diff[i] < 0){
                sums.add(sum);
                sum = 0;
            }else{
                sum += diff[i];
            }
        }
        if(diff[diff.length-1] >= 0){
            sums.add(sum);
        }

        int max = 0;
        int secondMax = 0;
        for(Integer iSum:sums){
            if(iSum >= max){
                secondMax = max;
                max = iSum;
            }else if(iSum > secondMax){
                secondMax = iSum;
            }
        }
        return max + secondMax;
    }
}
