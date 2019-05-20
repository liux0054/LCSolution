package medium.lc401tolc600;

import java.util.Arrays;

public class LC518 {

    public int change(int amount, int[] coins) {
        int[] sums = new int[amount+1];
        Arrays.sort(coins);
        sums[0] = 1;
        for(int coin:coins){
            for(int i=1; i<=amount; i++){
                if(i-coin >= 0) sums[i] += sums[i-coin];
            }
        }
        return sums[amount];
    }
}
