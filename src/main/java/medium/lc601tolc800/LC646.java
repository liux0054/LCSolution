package medium.lc601tolc800;

import java.util.Arrays;

public class LC646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[0]-b[0]);
       int[][] f = new int[pairs.length][2];
       int notUse = 0;
       int use = 1;
       f[0][notUse] = 0;
       f[0][use] = 1;

       for(int i=1; i<pairs.length; i++){
           f[i][notUse] = Math.max(f[i-1][notUse], f[i-1][use]);
           f[i][use] = 1;
           for(int j=i-1; j>=0; j--){
               if(pairs[j][1] < pairs[i][0]){
                   f[i][use] = Math.max(f[i][use], f[j][1]+1);
               }
           }
       }
       return Math.max(f[pairs.length-1][use], f[pairs.length-1][notUse]);
    }
}
