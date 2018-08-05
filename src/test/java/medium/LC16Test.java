package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC16;

public class LC16Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(new LC16().threeSumClosest(new int[] {-1, 2, 1, -4}, 1), 2);
    }
}
