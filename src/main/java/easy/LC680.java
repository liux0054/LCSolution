package easy;

public class LC680 {
    public boolean validPalindrome(String s) {
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return isPalindrome(s.substring(i+1, s.length()-i)) || isPalindrome(s.substring(i, s.length()-i-1));
            }
        }
        return true;
    }

    private boolean isPalindrome(String s){
        StringBuilder reversedS = new StringBuilder().append(s).reverse();
        StringBuilder ss = new StringBuilder().append(s);
        for(int i=0; i<reversedS.length(); i++){
            if(reversedS.charAt(i) != ss.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
