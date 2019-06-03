package medium.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import medium.LC921;

public class LC921Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(1, new LC921().minAddToMakeValid("())"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(3, new LC921().minAddToMakeValid("((("));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(4, new LC921().minAddToMakeValid("()))(("));
    }
}
