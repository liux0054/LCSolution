package easy;

public class LC58 {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - 1 -s.lastIndexOf(" ");
    }
}
