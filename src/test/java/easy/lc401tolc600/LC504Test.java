package easy.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import easy.lc401tolc600.LC504;

public class LC504Test {

    @Test
    public void testCase1(){
        Assert.assertEquals("202", new LC504().convertToBase7(100));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals("-10", new LC504().convertToBase7(-7));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals("0", new LC504().convertToBase7(0));
    }
}
