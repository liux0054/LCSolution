package easy.lc601tolc800;

import org.junit.Assert;
import org.junit.Test;

import easy.LC697;

public class LC697Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC697().findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(6, new LC697().findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(1, new LC697().findShortestSubArray(new int[]{1,2,3,4}));
    }
}
