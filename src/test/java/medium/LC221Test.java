package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC221Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(4, new LC221().maximalSquare(new char[][]{{'1','0','1','0','0'}, {'1','0','1','1','1'}, {'1','1','1','1','1'}, {'1','0','0','1','0'}}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(4, new LC221().maximalSquare(new char[][]{{'1','0','1','1'}, {'1','1','1','1'}, {'1','1','1','1'}}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(4, new LC221().maximalSquare(new char[][]{{'1','1','0','1'}, {'1','1','1','1'}, {'1','1','1','1'}}));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(0, new LC221().maximalSquare(new char[][]{}));
    }

    @Test
    public void testCase5(){
        Assert.assertEquals(0, new LC221().maximalSquare(new char[][]{{0}}));
    }
}
