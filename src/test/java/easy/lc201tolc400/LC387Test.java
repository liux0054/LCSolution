package easy.lc201tolc400;

import org.junit.Assert;
import org.junit.Test;

import easy.lc201tolc400.LC387;

public class LC387Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(0, new LC387().firstUniqChar("leetcode"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(2, new LC387().firstUniqChar("loveleetcode"));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(-1, new LC387().firstUniqChar(""));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(-1, new LC387().firstUniqChar("aa"));
    }
}
