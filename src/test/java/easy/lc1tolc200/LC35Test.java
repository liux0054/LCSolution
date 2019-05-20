package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import easy.lc1tolc200.LC35;

public class LC35Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC35().searchInsert(new int[]{1,3,5,6}, 5));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(1, new LC35().searchInsert(new int[]{1,3,5,6}, 2));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(4, new LC35().searchInsert(new int[]{1,3,5,6}, 7));
    }

    @Test
    public void testCase5(){
        Assert.assertEquals(0, new LC35().searchInsert(new int[]{1,3,5,6}, 0));
    }

    @Test
    public void testCase6(){
        Assert.assertEquals(1, new LC35().searchInsert(new int[]{1}, 2));
    }
}
