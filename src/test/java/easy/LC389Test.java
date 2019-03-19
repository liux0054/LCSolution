package easy;

import org.junit.Assert;
import org.junit.Test;

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
