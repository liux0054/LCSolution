package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC74;

public class LC74Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC74().searchMatrix(new int[][]{
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,50},
        }, 3));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC74().searchMatrix(new int[][]{
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,50},
        }, 13));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC74().searchMatrix(new int[][]{
            {1}
        }, 1));
    }

    @Test
    public void testCase4(){
        Assert.assertFalse(new LC74().searchMatrix(new int[][]{
            {1}
        }, 0));
    }

    @Test
    public void testCase5(){
        Assert.assertTrue(new LC74().searchMatrix(new int[][]{
            {1,3,5}
        }, 1));
    }
}
