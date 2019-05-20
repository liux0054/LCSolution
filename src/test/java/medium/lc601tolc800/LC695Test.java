package medium.lc601tolc800;

import org.junit.Assert;
import org.junit.Test;

import medium.lc601tolc800.LC695;

public class LC695Test {
    @Test
    public void testCase1(){
        int[][] grid = new int[][]{
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        Assert.assertEquals(6, new LC695().maxAreaOfIsland(grid));
    }

    @Test
    public void testCase2(){
        int[][] grid = new int[][]{
            {0,0,1,0,0,0,0,1,0,0,0,0,0}};

        Assert.assertEquals(1, new LC695().maxAreaOfIsland(grid));
    }

    @Test
    public void testCase3(){
        int[][] grid = new int[][]{
            {0,0,0,0,0,0,0,0,0,0,0,0,0}};

        Assert.assertEquals(0, new LC695().maxAreaOfIsland(grid));
    }
}
