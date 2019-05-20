package medium.lc801tolc1000;

import java.util.ArrayList;
import java.util.List;

public class LC986 {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
       int index1 = 0;
       int index2 = 0;
        List<int[]> answer = new ArrayList();
       while(index1 < A.length && index2 < B.length){
           int[] interval1 = A[index1];
           int[] interval2 = B[index2];
           if(interval2[1] < interval1[0]){
               index2 ++;
           }else if(interval1[1] < interval2[0]){
               index1++;
           }else{
               answer.add(new int[]{Math.max(interval1[0], interval2[0]), Math.min(interval1[1], interval2[1])});
               if(interval1[1] < interval2[1]){
                   index1++;
               }else if(interval1[1] > interval2[1]){
                   index2++;
               }else{
                   index1++;
                   index2++;
               }
           }
       }
       int[][] ans = new int[answer.size()][2];
       for(int i=0; i<answer.size(); i++){
           ans[i][0] = answer.get(i)[0];
           ans[i][1] = answer.get(i)[1];
       }
       return ans;
    }
}
