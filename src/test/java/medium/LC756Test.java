package medium;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class LC756Test {

    @Test
    public void testCase1(){
        Assert.assertTrue(new LC756().pyramidTransition("BCD", Arrays.asList("BCG", "CDE", "GEA", "FFF")));
    }

    @Test
    public void testCase2(){
        Assert.assertFalse(new LC756().pyramidTransition("AABA", Arrays.asList("AAA", "AAB", "ABA", "ABB", "BAC")));
    }


    @Test
    public void testCase3(){
        Assert.assertTrue(new LC756().pyramidTransition("DBCDA",
            Arrays.asList("ACC","ACB","ACA","AAC","ACD","BCD","BCC","BAB","CCD","CCA","CCB","DAD","DAC","AAB","CAD",
                "ABB","ABC","ABD","BDC","BDB","BBD","BBC","BBB","ADD","ADB","DDA","CDD","CBC","CDA","CDB","DBD","BDA")));
    }
}
