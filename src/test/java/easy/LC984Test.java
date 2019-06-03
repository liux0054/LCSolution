package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC984;

public class LC984Test {

    @Test
    public void testCase1(){
        Assert.assertEquals("bba", new LC984().strWithout3a3b(1, 2));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals("aabaa", new LC984().strWithout3a3b(4, 1));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals("ba", new LC984().strWithout3a3b(1, 1));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals("a", new LC984().strWithout3a3b(1, 0));
    }

    @Test
    public void testCase5(){
        Assert.assertEquals("bbab", new LC984().strWithout3a3b(1, 3));
    }

    @Test
    public void testCase6(){
        Assert.assertEquals("bbaa", new LC984().strWithout3a3b(2, 2));
    }
}
