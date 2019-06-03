package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC645;

public class LC645Test {

    @Test
    public void testCase1(){
        Assert.assertArrayEquals(new int[]{2, 3}, new LC645().findErrorNums(new int[]{1,2,2,4}));
    }
}
