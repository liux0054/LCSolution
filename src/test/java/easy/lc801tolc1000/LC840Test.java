package easy.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import easy.LC840;

public class LC840Test {

    @Test
    public void testCase1(){
        int[][] grid = new int[][]{
            {4,3,8,4},
            {9,5,1,9},
            {2,7,6,2}
        };

        Assert.assertEquals(1, new LC840().numMagicSquaresInside(grid));
    }

    @Test
    public void testCase2(){
        int[][] grid = new int[][]{
            {5,5,5},
            {5,5,5},
            {5,5,5}
        };

        Assert.assertEquals(0, new LC840().numMagicSquaresInside(grid));
    }
}
