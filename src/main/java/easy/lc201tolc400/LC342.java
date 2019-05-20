package easy.lc201tolc400;

public class LC342 {

    public boolean isPowerOfFour(int num) {
        return Integer.bitCount(num) == 1 && (Integer.toBinaryString(num).length()-1)%2==0;
    }

}
