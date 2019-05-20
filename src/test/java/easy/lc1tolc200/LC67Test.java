package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import easy.lc1tolc200.LC67;

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
