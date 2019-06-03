package medium;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import medium.LC539;

public class LC539Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(1,  new LC539().findMinDifference(Arrays.asList("23:59","00:00")));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(35,  new LC539().findMinDifference(Arrays.asList("23:59","00:34")));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(1,  new LC539().findMinDifference(Arrays.asList("23:59","00:34", "00:27", "23:58")));
    }
}
