package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC594Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(5, new LC594().findLHS(new int[]{1,3,2,2,5,2,3,7}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(0, new LC594().findLHS(new int[]{2,2,2,2,2,2,2,2}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC594().findLHS(new int[]{}));
    }
}
