package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC217Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC217().containsDuplicate(new int[]{1,2,3,1}));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC217().containsDuplicate(new int[]{1,2,3,4}));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC217().containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}
