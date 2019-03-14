package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC415Test {

    @Test
    public void testCase1(){
        Assert.assertEquals("0", new LC415().addStrings("0", "0"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals("1", new LC415().addStrings("0", "1"));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals("198", new LC415().addStrings("99", "99"));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals("438", new LC415().addStrings("179", "259"));
    }

    @Test
    public void testCase5(){
        Assert.assertEquals("108", new LC415().addStrings("9", "99"));
    }
}
