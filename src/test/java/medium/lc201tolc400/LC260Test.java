package medium.lc201tolc400;

import org.junit.Assert;
import org.junit.Test;

import medium.lc201tolc400.LC260;

public class LC260Test {
    @Test
    public void testCase1(){
        Assert.assertArrayEquals(new int[]{3,5}, new LC260().singleNumber(new int[]{1,2,1,3,2,5}));
    }


    @Test
    public void testCase2(){
        Assert.assertArrayEquals(new int[]{3,5}, new LC260().singleNumber(new int[]{3,5}));
    }
}
