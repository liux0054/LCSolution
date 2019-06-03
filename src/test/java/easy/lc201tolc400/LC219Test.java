package easy.lc201tolc400;

import org.junit.Assert;
import org.junit.Test;

import easy.LC219;

public class LC219Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC219().containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }

    @Test
    public void testCase2(){
        Assert.assertTrue(new LC219().containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }

    @Test
    public void testCase3(){
        Assert.assertFalse(new LC219().containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
}
