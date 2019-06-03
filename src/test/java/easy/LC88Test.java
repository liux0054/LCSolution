package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC88;

public class LC88Test {

    @Test
    public void testCase1(){
        int[] arr1 = new int[]{1,2,3,0,0,0};
        new LC88().merge(arr1, 3, new int[]{2, 5, 6}, 3);
        Assert.assertArrayEquals(new int[]{1,2,2,3,5,6}, arr1);
    }

    @Test
    public void testCase2(){
        int[] arr1 = new int[]{1,2,3,0,0,0};
        new LC88().merge(arr1, 3, new int[]{}, 0);
        Assert.assertArrayEquals(new int[]{1,2,3,0,0,0}, arr1);
    }

    @Test
    public void testCase3(){
        int[] arr1 = new int[]{0,0,0,0,0,0};
        new LC88().merge(arr1, 0, new int[]{1,2,3}, 3);
        Assert.assertArrayEquals(new int[]{1,2,3,0,0,0}, arr1);
    }
}
