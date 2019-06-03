package medium;

import org.junit.Assert;
import org.junit.Test;

import medium.LC829;

public class LC829Test {
     @Test
     public void testCase1(){
         Assert.assertEquals(2, new LC829().consecutiveNumbersSum(5));
     }

     @Test
     public void testCase2(){
         Assert.assertEquals(3, new LC829().consecutiveNumbersSum(9));
     }

     @Test
    public void testCase3(){
         Assert.assertEquals(4, new LC829().consecutiveNumbersSum(15));
     }
}
