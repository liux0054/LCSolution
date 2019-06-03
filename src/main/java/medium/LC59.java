package medium;

public class LC59 {
    public int[][] generateMatrix(int n) {
        if(n == 1){
            return new int[][]{{1}};
        }

        int[][] answer = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        int row = 0;
        int column = -1;
        int i = 1;
        while(i <= n*n){

            column++;
            while(column < n && !visited[row][column]){
                visited[row][column] = true;
                answer[row][column] = i;
                column++;
                i++;
            }

            if(column == n || visited[row][column]){
                column--;
            }

            row++;
            while(row < n && !visited[row][column]){
                visited[row][column] = true;
                answer[row][column] = i;
                row++;
                i++;
            }

            if(row == n || visited[row][column]){
                row--;
            }

            column--;
            while(column >=0 && !visited[row][column]){
                visited[row][column] = true;
                answer[row][column] = i;
                column--;
                i++;
            }

            if(column == -1 || visited[row][column]){
                column++;
            }


            row--;
            while(row >= 0 && !visited[row][column]){
                visited[row][column] = true;
                answer[row][column] = i;
                row--;
                i++;
            }

            if(row == -1 || visited[row][column]){
                row++;
            }
        }

        return answer;
    }
}
