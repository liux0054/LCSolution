package easy.lc1tolc200;

import org.junit.Assert;
import org.junit.Test;

import easy.LC58;

public class LC58Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(5, new LC58().lengthOfLastWord("Hello"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(5, new LC58().lengthOfLastWord("Hello world"));
    }
}
