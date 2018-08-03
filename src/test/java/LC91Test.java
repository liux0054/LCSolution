import org.junit.Assert;
import org.junit.Test;

public class LC91Test {


   @Test
   public void testCase1(){
       Assert.assertEquals(new LC91().numDecodings("12"), 2);
   }

   @Test
   public void testCase3(){
        Assert.assertEquals(new LC91().numDecodings("226"), 3);
   }

    @Test
    public void testCase4(){
        Assert.assertEquals(new LC91().numDecodings("01"), 0);
    }

    @Test
    public void testCase5(){
        Assert.assertEquals(new LC91().numDecodings("10"), 1);
    }
}
