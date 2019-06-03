package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC456;


public class LC456Test {

    @Test
    public void testExist(){
        Assert.assertFalse(new LC456().find132pattern(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testNotExist(){
        Assert.assertTrue(new LC456().find132pattern(new int[]{3, 1, 4, 2}));
    }


}
