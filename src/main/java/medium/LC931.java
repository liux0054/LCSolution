package medium;

public class LC931 {
    public int minFallingPathSum(int[][] A) {
       int[][] f = new int[A.length][A[0].length];
       for(int column=0; column<A[0].length; column++){
           f[0][column] = A[0][column];
       }

       for(int row=1; row<A.length; row++){
           for(int column=0; column<A[row].length; column++){
               int minPathSumTillNow = Integer.MAX_VALUE;
               if(column-1>=0){
                   minPathSumTillNow = Math.min(minPathSumTillNow, f[row-1][column-1]);
               }
               if(column+1<A[row].length){
                   minPathSumTillNow = Math.min(minPathSumTillNow, f[row-1][column+1]);
               }
               minPathSumTillNow = Math.min(minPathSumTillNow, f[row-1][column]);
               f[row][column] = minPathSumTillNow + A[row][column];
           }
       }

       int answer = Integer.MAX_VALUE;
       for(int column=0; column<A[A.length-1].length; column++){
           answer = Math.min(answer, f[A.length-1][column]);
       }
       return answer;
    }
}
