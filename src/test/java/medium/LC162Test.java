package medium;

import org.junit.Test;

public class LC162Test {
    @Test
    public void testCase1() {
        System.out.println(new LC162().findPeakElement(new int[] {1,2,3,1}));
    }

    @Test
    public void testCase2() {
        System.out.println(new LC162().findPeakElement(new int[] {1,2,1,3,5,6,4}));
    }

    @Test
    public void testCase3() {
        System.out.println(new LC162().findPeakElement(new int[] {1}));
    }

    @Test
    public void testCase4() {
        System.out.println(new LC162().findPeakElement(new int[] {1,2,1}));
    }

    @Test
    public void testCase5() {
        System.out.println(new LC162().findPeakElement(new int[] {1,2,3, 1}));
    }
}
