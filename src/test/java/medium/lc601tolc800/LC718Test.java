package medium.lc601tolc800;

import org.junit.Assert;
import org.junit.Test;

import medium.LC718;

public class LC718Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(3, new LC718().findLength(new int[]{1,2,3,2,1}, new int[]{3,2,1,4,7}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(2, new LC718().findLength(new int[]{0,1,1,1,1}, new int[]{1,0,1,0,1}));
    }
}
