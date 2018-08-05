package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC525Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(new LC525().findMaxLength(new int[]{0,1}), 2);
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(new LC525().findMaxLength(new int[]{0,1,0}), 2);
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(new LC525().findMaxLength(new int[]{0,1,1}), 2);
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(new LC525().findMaxLength(new int[]{1,1,1}), 0);
    }
}
