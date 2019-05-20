package medium.lc601tolc800;

public class LC718 {
    public int findLength(int[] A, int[] B) {
       int[][][] maxLength = new int[A.length+1][B.length+1][2];
       for(int i=0; i<A.length; i++){
           for(int j=0; j<B.length; j++){
               if(A[i] != B[j]){
                   maxLength[i+1][j+1][0] = Math.max(Math.max(maxLength[i][j+1][0], maxLength[i+1][j][0]), Math.max(maxLength[i][j+1][1], maxLength[i+1][j][1]));
               }else{
                   maxLength[i+1][j+1][1] = maxLength[i][j][1] + 1;
               }
           }
       }
       return Math.max(maxLength[A.length][B.length][0], maxLength[A.length][B.length][1]);
    }
}
