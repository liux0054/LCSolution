package medium;


import org.junit.Assert;
import org.junit.Test;

import medium.LC398;

public class LC398Test {

    @Test
    public void testCase1(){
        LC398 lc398 = new LC398();
        LC398.Solution sl = lc398.new Solution(new int[] {1,2,3,3,3});
        Assert.assertEquals(0, sl.pick(1));
        Assert.assertEquals(1, sl.pick(2));
        //Assert.assertEquals(2, sl.pick(3));
    }
}
