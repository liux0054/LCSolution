package easy.lc801tolc1000;

import java.util.HashSet;
import java.util.Set;

public class LC840 {
    public int numMagicSquaresInside(int[][] grid) {
        int answer = 0;
        for(int i=2; i<grid.length; i++){
            for(int j=2; j<grid[i].length; j++){
                int[][] subGrid = getSubGrid(grid, i, j);
                int sum1 = getRowSum(subGrid, 0);
                if( isOneToNine(subGrid) && sum1 == getRowSum(subGrid, 1) && sum1 == getRowSum(subGrid, 2) && sum1 == getColumSum(subGrid, 0)
                && sum1 == getColumSum(subGrid, 1) && sum1 == getColumSum(subGrid, 2) && sum1 == getDiaSum(subGrid, true)
                && sum1 == getDiaSum(subGrid, false)){
                    answer ++;
                }
            }
        }
        return answer;
    }

    private int[][] getSubGrid(int[][] grid, int x, int y){
        int beginX = x - 2;
        int beginY = y - 2;
        int[][] subgrid = new int[3][3];
        for(int i=beginX; i<=x; i++){
            for(int j=beginY; j<=y; j++){
                subgrid[i-beginX][j-beginY] = grid[i][j];
            }
        }
        return subgrid;
    }

    private int getRowSum(int[][] grid, int rowNumber){
        int sum = 0;
        for(int i=0; i<grid[rowNumber].length; i++){
            sum += grid[rowNumber][i];
        }
        return sum;
    }

    private int getColumSum(int[][] grid, int columnNumber){
        int sum = 0;
        for(int i=0; i<grid.length; i++){
            sum += grid[i][columnNumber];
        }
        return sum;
    }

    private int getDiaSum(int[][] grid, boolean firstDia){
        int sum = 0;
        for(int i=0; i<grid.length; i++){
            if(firstDia){
                sum += grid[i][i];
            }else{
                sum += grid[i][2-i];
            }
        }
        return sum;
    }

    private boolean isOneToNine(int[][] grid){
        Set<Integer> integerSet = new HashSet<>();
        for(int[] row : grid){
            for(int number : row){
                if(number < 1 || number > 9){
                    return false;
                }
                integerSet.add(number);
            }
        }
        return integerSet.size() == 9;
    }
}
