package easy.lc201tolc400;

import org.junit.Assert;
import org.junit.Test;

import easy.LC389;

public class LC389Test {

    @Test
    public void testCase1(){
        Assert.assertEquals('e', new LC389().findTheDifference("abcd", "abcde"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals('b', new LC389().findTheDifference("a", "ab"));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals('b', new LC389().findTheDifference("ca", "abc"));
    }
}
