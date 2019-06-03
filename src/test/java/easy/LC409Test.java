package easy;

import org.junit.Assert;
import org.junit.Test;

import easy.LC409;

public class LC409Test {

    @Test
    public void testCase1(){
        Assert.assertEquals(7, new LC409().longestPalindrome("abccccdd"));
    }

    @Test
    public void testCase2(){
        Assert.assertEquals(1, new LC409().longestPalindrome("a"));
    }

    @Test
    public void testCase3(){
        Assert.assertEquals(1, new LC409().longestPalindrome("aA"));
    }

    @Test
    public void testCase4(){
        Assert.assertEquals(0, new LC409().longestPalindrome(""));
    }

    @Test
    public void testCase5(){
        Assert.assertEquals(2, new LC409().longestPalindrome("bb"));
    }

    @Test
    public void testCase6(){
        Assert.assertEquals(983, new LC409().longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
    }

}
