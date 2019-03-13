package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC849Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC849().maxDistToClosest(new int[]{1,0,0,0,1,0,1}));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(3, new LC849().maxDistToClosest(new int[]{1,0,0,0}));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(2, new LC849().maxDistToClosest(new int[]{0,1,1,1,0,0,1,0,0}));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(3, new LC849().maxDistToClosest(new int[]{0,0,0,1,0,0,0,1,0,0,0,0,1,1,0,0,0,1}));
    }
}
