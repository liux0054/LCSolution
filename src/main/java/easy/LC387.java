package easy;

public class LC387 {
    public int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }
}
