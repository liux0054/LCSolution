package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC656Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(4, new LC565().arrayNesting(new int[]{5,4,0,3,1,6,2}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(1, new LC565().arrayNesting(new int[]{0,1}));
    }
}