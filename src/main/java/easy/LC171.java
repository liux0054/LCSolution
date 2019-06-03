package easy;

public class LC171 {

    class Solution{
        public int titleToNumber(String s){
            return s.length() == 1 ? (s.charAt(0) - 'A' + 1) : ((s.charAt(s.length()-1) - 'A' + 1) + 26 * titleToNumber(s.substring(0, s.length()-1)));
        }
    }
}
