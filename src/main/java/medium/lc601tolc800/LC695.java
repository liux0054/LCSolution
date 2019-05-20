package medium.lc601tolc800;

public class LC695 {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] searched = new boolean[grid.length][grid[0].length];
        int answer = 0;
        for(int i=0; i<grid.length; i++){
           for(int j=0; j<grid[i].length; j++){
               if(grid[i][j] == 1 && !searched[i][j]){
                   answer = Math.max(answer, search(grid, searched, i, j));
               }
           }
       }
       return answer;
    }

    private int search(int[][] grid, boolean[][] searched, int x, int y){
        if(x<0 || y<0 || x >=grid.length || y>=grid[x].length || grid[x][y] == 0 || searched[x][y]){
            return 0;
        }
        searched[x][y] = true;
        return 1 + search(grid, searched, x+1, y) + search(grid, searched, x-1, y) + search(grid, searched, x, y+1) + search(grid, searched, x, y-1);
    }
}
