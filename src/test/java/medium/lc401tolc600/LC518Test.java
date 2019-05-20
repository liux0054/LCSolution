package medium.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import medium.lc401tolc600.LC518;

public class LC518Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(new LC518().change( 5, new int[]{1, 2, 5}), 4);
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(new LC518().change( 3, new int[]{2}), 0);
    }

}
