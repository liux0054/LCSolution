package easy;

public class LC520 {
    public boolean detectCapitalUse(String word) {
       if(word.length() == 1){
           return true;
       }

       if(word.charAt(0) >= 'a' && word.charAt(0) <='z'){
           return word.toLowerCase().equals(word);
       }else{
           String sub = word.substring(1);
           return sub.toLowerCase().equals(sub) || sub.toUpperCase().equals(sub);
       }
    }
}
