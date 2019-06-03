package easy.lc801tolc1000;

import org.junit.Assert;
import org.junit.Test;

import easy.LC929;

public class LC929Test {
    @Test
    public void testCase1(){
        Assert.assertEquals(2, new LC929().numUniqueEmails(
            new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }
}
