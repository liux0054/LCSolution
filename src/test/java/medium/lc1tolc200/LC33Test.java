package medium.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import medium.LC33;

public class LC33Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(4,  new LC33().search(new int[]{4,5,6,7,0,1,2}, 0));
    }
}
