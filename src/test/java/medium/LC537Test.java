package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC537Test {

    @Test
    public void testCase1(){
        Assert.assertEquals("0+2i", new LC537().complexNumberMultiply("1+1i", "1+1i"));
    }


    @Test
    public void testCase2(){
        Assert.assertEquals("0+-2i", new LC537().complexNumberMultiply("1+-1i", "1+-1i"));
    }
}
