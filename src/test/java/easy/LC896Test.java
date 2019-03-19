package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC896Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC896().isMonotonic(new int[]{1,2,2,3}));
    }

    @Test
    public void testCase2(){
        Assert.assertTrue(new LC896().isMonotonic(new int[]{6,5,4,4}));
    }

    @Test
    public void testCase3(){
        Assert.assertTrue(new LC896().isMonotonic(new int[]{6}));
    }

    @Test
    public void testCase4(){
        Assert.assertTrue(new LC896().isMonotonic(new int[]{6,5}));
    }

    @Test
    public void testCase5(){
        Assert.assertFalse(new LC896().isMonotonic(new int[]{1,3,2}));
    }

    @Test
    public void testCase6(){
        Assert.assertTrue(new LC896().isMonotonic(new int[]{1,2,4,5}));
    }

    @Test
    public void testCase7(){
        Assert.assertTrue(new LC896().isMonotonic(new int[]{1,1,1}));
    }
}
