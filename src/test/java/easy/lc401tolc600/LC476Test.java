package easy.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import easy.lc601tolc800.LC746;

public class LC476Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(15, new LC746().minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(0, new LC746().minCostClimbingStairs(new int[]{10, 15}));
    }


    @Test
    public void testCase3(){
        Assert.assertEquals(6, new LC746().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

}
