package medium.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import medium.lc401tolc600.LC451;

public class LC451Test {
    @Test
    public void testCase1(){
        Assert.assertEquals("eert", new LC451().frequencySort("tree"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals("", new LC451().frequencySort(""));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals("aaaccc", new LC451().frequencySort("cccaaa"));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals("bbAa", new LC451().frequencySort("Aabb"));
    }
}

