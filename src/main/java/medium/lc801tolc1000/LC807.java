package medium.lc801tolc1000;

public class LC807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[0].length];

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
            }
        }

        for(int j=0; j<grid[0].length; j++){
            for(int i=0; i<grid.length; i++){
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }

        int sum = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                sum += Math.min(rowMax[i], colMax[j]) - grid[i][j];
            }
        }
        return sum;
    }
}
