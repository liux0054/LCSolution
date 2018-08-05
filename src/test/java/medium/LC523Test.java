package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC523Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC523().checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
    }

    @Test
    public void testCase2(){
        Assert.assertTrue(new LC523().checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
    }

    @Test
    public void testCase3(){
        Assert.assertFalse(new LC523().checkSubarraySum(new int[]{0,5,6,0}, 0));
    }

    @Test
    public void testCase4(){
        Assert.assertFalse(new LC523().checkSubarraySum(new int[]{0}, -1));
    }

    @Test
    public void testCase5(){
        Assert.assertTrue(new LC523().checkSubarraySum(new int[]{1,1}, 2));
    }
}


