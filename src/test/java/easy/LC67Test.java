package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC67Test {

    @Test
    public void testCase1(){
        Assert.assertEquals("100", new LC67().addBinary("11", "1"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals("0", new LC67().addBinary("00", "00"));
    }


}
