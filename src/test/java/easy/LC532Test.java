package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC532;

public class LC532Test {

      @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC532().findPairs(new int[]{3, 1, 4, 1, 5}, 2));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(4, new LC532().findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(1, new LC532().findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(0, new LC532().findPairs(new int[]{1, 3, 1, 5, 4}, -1));
    }
}
