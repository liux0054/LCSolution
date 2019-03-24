package easy;

import org.junit.Assert;
import org.junit.Test;

public class LC492Test {
    @Test
    public void testCase1(){
        Assert.assertArrayEquals(new int[]{2,2}, new LC492().constructRectangle(4));
    }

    @Test
    public void testCase2(){
        Assert.assertArrayEquals(new int[]{13,1}, new LC492().constructRectangle(13));
    }

    @Test
    public void testCase4(){
        Assert.assertArrayEquals(new int[]{1,1}, new LC492().constructRectangle(1));
    }

    @Test
    public void testCase5(){
        Assert.assertArrayEquals(new int[]{4,3}, new LC492().constructRectangle(12));
    }

}
