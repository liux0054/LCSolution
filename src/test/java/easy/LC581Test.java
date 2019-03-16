package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC581Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(5, new LC581().findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(0, new LC581().findUnsortedSubarray(new int[]{2}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(0, new LC581().findUnsortedSubarray(new int[]{2,2,2,2,2,2,2}));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(0, new LC581().findUnsortedSubarray(new int[]{1,2,3,4,5,6,7}));
    }

    @Test
    public void testCase5(){
        Assert.assertEquals(2, new LC581().findUnsortedSubarray(new int[]{2,1}));
    }

    @Test
    public void testCase6(){
        Assert.assertEquals(5, new LC581().findUnsortedSubarray(new int[]{5,4,3,2,1}));
    }
}
