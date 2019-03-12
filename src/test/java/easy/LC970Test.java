package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC970Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(7, new LC970().powerfulIntegers(2, 3, 10).size());
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(6, new LC970().powerfulIntegers(3, 5, 15).size());
    }
}
