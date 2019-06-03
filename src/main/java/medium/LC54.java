package medium;

import java.util.ArrayList;
import java.util.List;

public class LC54 {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> answer = new ArrayList<>();

        if(matrix == null || matrix.length==0){
            return new ArrayList<>();
        }
        if(matrix.length == 1){
            for(int number : matrix[0]){
                answer.add(number);
            }
            return answer;
        }
        if(matrix[0].length == 1){
            for(int i=0; i<matrix.length; i++){
                answer.add(matrix[i][0]);
            }
            return answer;
        }

        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int row = 0;
        int column = -1;
        while(true){

            //towards right
            column++;
            if(visited[row][column]){
                break;
            }
            while(column < matrix[row].length && !visited[row][column] ){
                visited[row][column] = true;
                answer.add(matrix[row][column]);
                column++;
            }
            if(column ==  matrix[row].length || visited[row][column]){
                column--;
            }


            //towards down
            row++;
            if(visited[row][column]){
                break;
            }
            while(row < matrix.length && !visited[row][column]){
                visited[row][column] = true;
                answer.add(matrix[row][column]);
                row++;
            }
            if(row == matrix.length || visited[row][column]){
                row--;
            }

            //towards left
            column--;
            if(visited[row][column]){
                break;
            }
            while(column>=0 && !visited[row][column]){
                visited[row][column] = true;
                answer.add(matrix[row][column]);
                column--;
            }
            if(column == -1 || visited[row][column]){
                column++;
            }

            //towards up
            row--;
            if(visited[row][column]){
                break;
            }
            while(row>=0 && !visited[row][column]){
                visited[row][column] = true;
                answer.add(matrix[row][column]);
                row--;
            }
            if(row == -1 || visited[row][column]) {
                row++;
            }
        }
        return answer;
    }
}
