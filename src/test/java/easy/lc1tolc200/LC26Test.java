package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import easy.lc1tolc200.LC26;

public class LC26Test {

    @Test
    public void testCase1(){
        int[] nums = new int[]{1,1,2};
        Assert.assertEquals(2, new LC26().removeDuplicates(nums));
        Assert.assertArrayEquals(new int[]{1, 2, 2}, nums);
    }

    @Test
    public void testCase2(){
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        Assert.assertEquals(5, new LC26().removeDuplicates(nums));
        //Assert.assertArrayEquals(new int[]{1, 2, 2}, nums);
    }

    @Test
    public void testCase3(){
        int[] nums = new int[]{1,1};
        Assert.assertEquals(1, new LC26().removeDuplicates(nums));
        //Assert.assertArrayEquals(new int[]{1, 2, 2}, nums);
    }

    @Test
    public void testCase4(){
        int[] nums = new int[]{1,1, 1};
        Assert.assertEquals(1, new LC26().removeDuplicates(nums));
        //Assert.assertArrayEquals(new int[]{1, 2, 2}, nums);
    }

    @Test
    public void testCase5(){
        int[] nums = new int[]{0,0,1,1,1,1,3,3,3,3,3};
        Assert.assertEquals(3, new LC26().removeDuplicates(nums));
        //Assert.assertArrayEquals(new int[]{1, 2, 2}, nums);
    }

}
