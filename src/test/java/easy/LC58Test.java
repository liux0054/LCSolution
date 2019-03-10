package easy;

import org.junit.Assert;
import org.junit.Test;

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
