package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC167;

public class LC167Test {

    @Test
    public void testCase1(){
        Assert.assertArrayEquals(new int[]{1, 2}, new LC167().twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void testCase2(){
        Assert.assertArrayEquals(new int[]{1, 2}, new LC167().twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void testCase4(){
        Assert.assertArrayEquals(new int[]{1, 2}, new LC167().twoSum(new int[]{0,0,3,4}, 0));
    }
}
