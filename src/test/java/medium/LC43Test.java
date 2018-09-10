package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC43Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(new LC43().multiply("2","3"), "6");
    }

    @Test
    public void testCase2(){
        Assert.assertEquals("56088", new LC43().multiply("123", "456"));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals("0", new LC43().multiply("0", "0"));
    }
}
