package easy.lc401tolc600;

import org.junit.Assert;
import org.junit.Test;

import easy.LC434;

public class LC434Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(5, new LC434().countSegments("Hello, my name is John"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(0, new LC434().countSegments("       "));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(5, new LC434().countSegments("Hello,  my  name   is     John"));
    }

}
