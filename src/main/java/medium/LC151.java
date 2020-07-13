package medium;

import java.util.ArrayList;
import java.util.List;

public class LC151 {
    public String reverseWords(String s) {
        List<String> reversedWorlds = new ArrayList<>();
        for (String split : s.trim().split(" ")) {
            if (!split.equals("")) { 
                reversedWorlds.add(0, getLastWorld(split)); 
            }
        }
        return String.join(" ", reversedWorlds);
    }
    
    private String getLastWorld(String s) {
        String trimmedString = s.trim();
        int i = trimmedString.length() - 1;
        while (i > 0 && trimmedString.charAt(i) != ' ') {
            i--;
        }
        return trimmedString.charAt(i) == ' ' ? trimmedString.substring(i+1) : trimmedString.substring(i);
    }
}
