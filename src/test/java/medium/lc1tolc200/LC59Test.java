package medium.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import medium.LC59;

public class LC59Test {

    @Test
    public void testCase1(){
        Assert.assertArrayEquals(new int[][]{
            {1,2,3},
            {8,9,4},
            {7,6,5}
        }, new LC59().generateMatrix(3));
    }

    @Test
    public void testCase2(){
        Assert.assertArrayEquals(new int[][]{
            {1}
        }, new LC59().generateMatrix(1));
    }

    @Test
    public void testCase3(){
        Assert.assertArrayEquals(new int[][]{
            {1,2,3,4,5},
            {16,17,18,19,6},
            {15,24,25,20,7},
            {14,23,22,21,8},
            {13,12,11,10,9},
        }, new LC59().generateMatrix(5));
    }

}
