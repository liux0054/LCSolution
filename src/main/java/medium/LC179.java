package medium;

import java.util.Arrays;
import java.util.Comparator;

public class LC179 {
    public String largestNumber(int[] nums) {
        Comparator<String> comparator = (o1, o2) -> {
            int shortLen = o1.length() > o2.length() ? o2.length() : o1.length();
            if(!o1.substring(0, shortLen).equals(o2.substring(0, shortLen))) return o2.compareTo(o1);
            return (o2 + o1).compareTo(o1 + o2);
        };

        String[] numStr = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            numStr[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(numStr, comparator);

        String ans = "";
        for(String s:numStr){
            ans += s;
        }
        while(ans.length() > 1 && ans.charAt(0) == '0'){
            ans = ans.substring(1);
        }

        return ans;
    }
}
