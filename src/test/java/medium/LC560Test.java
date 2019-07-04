package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC560Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC560().subarraySum(new int[]{1,1,1}, 2));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(1, new LC560().subarraySum(new int[]{1,1,1}, 3));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC560().subarraySum(new int[]{1,1,1}, 4));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(2, new LC560().subarraySum(new int[]{1,2,3}, 3));
    }

    @Test
    public void testCase5(){
        Assert.assertEquals(0, new LC560().subarraySum(new int[]{1}, 0));
    }

}
