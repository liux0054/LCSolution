package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC540Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC540().singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(10, new LC540().singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(1, new LC540().singleNonDuplicate(new int[]{1}));
    }
}
