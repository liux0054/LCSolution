package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC171;

public class LC171Test {

    @Test
    public void testCase1(){
        LC171 lc171 = new LC171();
        LC171.Solution solution = lc171.new Solution();
        Assert.assertEquals(1, solution.titleToNumber("A"));
    }


    @Test
    public void testCase2(){
        LC171 lc171 = new LC171();
        LC171.Solution solution = lc171.new Solution();
        Assert.assertEquals(28, solution.titleToNumber("AB"));
    }

    @Test
    public void testCase3(){
        LC171 lc171 = new LC171();
        LC171.Solution solution = lc171.new Solution();
        Assert.assertEquals(701, solution.titleToNumber("ZY"));
    }
}
