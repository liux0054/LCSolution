package easy.lc601tolc800;

import org.junit.Assert;
import org.junit.Test;

import easy.lc601tolc800.LC643;

public class LC643Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(12.75, new LC643().findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4), 0.00000000001);
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(2.8, new LC643().findMaxAverage(new int[]{4,0,4,3,3}, 5), 0.00000000001);
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(-1, new LC643().findMaxAverage(new int[]{-1}, 1), 0.00000000001);
    }

}
