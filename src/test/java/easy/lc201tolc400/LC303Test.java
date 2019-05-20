package easy.lc201tolc400;

import org.junit.Assert;
import org.junit.Test;

import easy.lc201tolc400.NumArray;

public class LC303Test {

    @Test
    public void testCase1(){
        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        Assert.assertEquals(1, obj.sumRange(0, 2));
        Assert.assertEquals(-1, obj.sumRange(2, 5));
        Assert.assertEquals(-3, obj.sumRange(0, 5));
    }

    @Test
    public void testCase2(){
        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        Assert.assertEquals(3, obj.sumRange(2, 2));
    }

    @Test
    public void testCase3(){
        int[] nums = new int[]{-2};
        NumArray obj = new NumArray(nums);
        Assert.assertEquals(0, obj.sumRange(4, 4));
    }

}
