package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC31Test {

    @Test
    public void testCase1(){
        LC31 lc31 = new LC31();
        int[] ans = new int[]{1,2,3};
        lc31.nextPermutation(ans);
        Assert.assertArrayEquals(new int[]{1,3,2}, ans);
    }

    @Test
    public void testCase2(){
        LC31 lc31 = new LC31();
        int[] ans = new int[]{3,2,1};
        lc31.nextPermutation(ans);
        Assert.assertArrayEquals(new int[]{1,2,3}, ans);
    }

    @Test
    public void testCase3(){
        LC31 lc31 = new LC31();
        int[] ans = new int[]{1,1,5};
        lc31.nextPermutation(ans);
        Assert.assertArrayEquals(new int[]{1,5,1}, ans);
    }

    @Test
    public void testCase4(){
        LC31 lc31 = new LC31();
        int[] ans = new int[]{1,3,2};
        lc31.nextPermutation(ans);
        Assert.assertArrayEquals(new int[]{2,1,3}, ans);
    }

    @Test
    public void testCase5(){
        LC31 lc31 = new LC31();
        int[] ans = new int[]{2,3,1};
        lc31.nextPermutation(ans);
        Assert.assertArrayEquals(new int[]{3,1,2}, ans);
    }
}
