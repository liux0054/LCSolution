package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC977Test {
    @Test
    public void testCase1(){
        Assert.assertArrayEquals(new int[]{0,1,9,16,100}, new LC977().sortedSquares(new int[]{-4,-1,0,3,10}));
    }

    @Test
    public void testCase2(){
        Assert.assertArrayEquals(new int[]{4,9,9,49,121}, new LC977().sortedSquares(new int[]{-7,-3,2,3,11}));
    }
}
