package easy;

import org.junit.Assert;
import org.junit.Test;

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
