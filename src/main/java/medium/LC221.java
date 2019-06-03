package medium;

public class LC221 {
    public int maximalSquare(char[][] matrix) {
       if(matrix.length == 0) return 0;
       int[][] sum = new int[matrix.length+1][matrix[0].length+1];
       for(int i=0; i<matrix.length; i++){
           for(int j=0; j<matrix[i].length; j++){
              sum[i+1][j+1] = sum[i+1][j] + sum[i][j+1] - sum[i][j] +  Character.getNumericValue(matrix[i][j]);
           }
       }
       int currentMax = 0;

       for(int i=0; i<matrix.length; i++){
           for(int j=0; j<matrix[i].length; j++){
               if(matrix[i][j] == '1'){
                   int tempMax = currentMax;
                   int diff = Integer.MAX_VALUE;
                   while(i+1-tempMax>=0 && j+1-tempMax >= 0){
                       diff = sum[i+1][j+1] - sum[i+1-tempMax][j+1] - sum[i+1][j+1-tempMax] + sum[i+1-tempMax][j+1-tempMax];
                       if(tempMax * tempMax > diff){
                           break;
                       }
                       tempMax++;
                   }
                   if(tempMax * tempMax > diff) tempMax--;
                   if(tempMax > currentMax) currentMax = tempMax;
               }
           }
       }
       return currentMax * currentMax;
    }
}
