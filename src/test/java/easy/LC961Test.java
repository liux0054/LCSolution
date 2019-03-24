package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC961Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(3, new LC961().repeatedNTimes(new int[]{1,2,3,3}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(2, new LC961().repeatedNTimes(new int[]{2,1,2,5,3,2}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(5, new LC961().repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }
}
