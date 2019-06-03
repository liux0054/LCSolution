package medium.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import medium.LC462;

public class LC462Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC462().minMoves2(new int[]{1,2,3}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(0, new LC462().minMoves2(new int[]{2}));
    }

}
