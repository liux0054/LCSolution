package medium;

import java.util.ArrayList;
import java.util.List;

public class LC131 {
    public List<List<String>> partition(String s) {
        List<List<String>> answer = new ArrayList<>();
        partitionRec(answer, new ArrayList<>(), s);
        return answer;
    }
    
    private void partitionRec(List<List<String>> ans, List<String> temp, String s) {
        if (s.length() == 0) {
            ans.add(new ArrayList<>(temp));
        }
        
        for (int i=0; i<=s.length()-1; i++) {
            if (isPalindrome(s.substring(0, i+1))) {
                temp.add(s.substring(0, i+1));
                partitionRec(ans, temp, s.substring(i+1));
                temp.remove(temp.size()-1);
            }
        }
    }
    
    private boolean isPalindrome(String s) {
        int begin = 0;
        int end = s.length() - 1;
        while(begin <= end) {
            if (s.charAt(begin) != s.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}
