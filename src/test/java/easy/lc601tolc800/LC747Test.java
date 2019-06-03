package easy.lc601tolc800;

import org.junit.Assert;
import org.junit.Test;

import easy.LC747;

public class LC747Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(1, new LC747().dominantIndex(new int[]{3, 6, 1, 0}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(-1, new LC747().dominantIndex(new int[]{1, 2, 3, 4}));
    }
}
