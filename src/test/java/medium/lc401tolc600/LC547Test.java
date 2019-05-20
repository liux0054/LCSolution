package medium.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import medium.lc401tolc600.LC547;

public class LC547Test {
 @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC547().findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}}));
    }


    @Test
    public void testCase2(){
        Assert.assertEquals(1, new LC547().findCircleNum(new int[][]{{1,1,0},{1,1,1},{0,1,1}}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(3, new LC547().findCircleNum(new int[][]{{1,0,0},{0,1,0},{0,0,1}}));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(1, new LC547().findCircleNum(new int[][]{
            {1,0,0,1},
            {0,1,1,0},
            {0,1,1,1},
            {1,0,1,1}
        }));
    }
}
