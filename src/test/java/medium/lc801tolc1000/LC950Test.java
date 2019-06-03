package medium.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import medium.LC950;

public class LC950Test {

    @Test
    public void testCase1(){
        Assert.assertArrayEquals(new int[]{2,13,3,11,5,17,7},
            new LC950().deckRevealedIncreasing(new int[]{17,13,11,2,3,5,7}));
    }

    @Test
    public void testCase2(){
        Assert.assertArrayEquals(new int[]{2},
            new LC950().deckRevealedIncreasing(new int[]{2}));
    }
}
