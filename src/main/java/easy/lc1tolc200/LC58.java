package easy.lc1tolc200;

public class LC58 {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - 1 -s.lastIndexOf(" ");
    }
}
