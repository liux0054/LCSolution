package easy.lc601tolc800;

import org.junit.Assert;
import org.junit.Test;

import easy.lc601tolc800.LC605;

public class LC605Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC605().canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC605().canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }


    @Test
    public void testCase3(){
        Assert.assertTrue(new LC605().canPlaceFlowers(new int[]{1,0,0,0,1,0,0}, 2));
    }
}

