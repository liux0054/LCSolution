package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC704Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(4, new LC704().search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(-1, new LC704().search(new int[]{-1,0,3,5,9,12}, 2));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(-1, new LC704().search(new int[]{-1}, 2));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(-1, new LC704().search(new int[]{}, 2));
    }

    @Test
    public void testCase5(){
        Assert.assertEquals(0, new LC704().search(new int[]{5}, 5));
    }

}
