package medium.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import medium.LC866;

public class LC866Test {

    @Test
    public void testCase1() {
        Assert.assertEquals(7, new LC866().primePalindrome(6));
    }

    @Test
    public void testCase2() {
        Assert.assertEquals(11, new LC866().primePalindrome(8));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(101, new LC866().primePalindrome(13));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(2, new LC866().primePalindrome(1));
    }

}