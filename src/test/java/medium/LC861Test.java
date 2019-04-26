package medium;

import org.junit.Assert;
import org.junit.Test;

public class LC861Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(39, new LC861().matrixScore(new int[][]{
            {0,0,1,1},
            {1,0,1,0},
            {1,1,0,0}
        }));
    }
}
