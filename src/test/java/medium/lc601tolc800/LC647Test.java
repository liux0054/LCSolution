package medium.lc601tolc800;

import org.junit.Assert;
import org.junit.Test;

import medium.lc601tolc800.LC647;

public class LC647Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(3, new LC647().countSubstrings("abc"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(6, new LC647().countSubstrings("aaa"));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(1, new LC647().countSubstrings("a"));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(2, new LC647().countSubstrings("ab"));
    }

}
