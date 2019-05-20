package medium.lc801tolc1000;

public class LC861 {
    public int matrixScore(int[][] A) {
         for(int i=0; i<A.length; i++){
             if(A[i][0] == 0){
                 for(int j=0; j<A[i].length; j++){
                     if(A[i][j] == 0){
                         A[i][j] = 1;
                     }else{
                         A[i][j] = 0;
                     }
                 }
             }
         }

         for(int column = 1; column<A[0].length; column++){
             int countOfOne = 0;
             int countOfZero = 0;
             for(int row=0; row<A.length; row++){
                 if(A[row][column] == 0){
                     countOfZero++;
                 }else{
                     countOfOne++;
                 }
             }
             if(countOfZero > countOfOne){
                 for(int row=0; row<A.length; row++){
                     if(A[row][column] == 0){
                         A[row][column] = 1;
                     }else{
                         A[row][column] = 0;
                     }
                 }
             }
         }

         int answer = 0;
         for(int row=0; row<A.length; row++){
             int sum = 0;
             for(int column=0; column<A[row].length; column++){
                 sum = sum * 2 + A[row][column];
             }
             answer += sum;
         }
         return answer;
    }
}
