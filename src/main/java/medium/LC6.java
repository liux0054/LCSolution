package medium;

import java.util.ArrayList;
import java.util.List;

public class LC6 {
    public String convert(String s, int numRows) {
        List<String> strForRows = new ArrayList<>(numRows);
        int currentRow = 0;
        int currentIndex = 0;
        for (int i = 0; i<numRows; i++) {
            strForRows.add("");
        }
        boolean downward = true;
        
        while (currentIndex < s.length()) {
            if (downward) {
                if (currentRow < numRows) {
                   strForRows.set(currentRow, strForRows.get(currentRow) + s.charAt(currentIndex));
                   currentRow++;
                   currentIndex++;
                } else {
                    downward = false;
                    currentRow-=2;
                    if (currentRow <0) {
                        currentRow = 0;
                    }
                }
            } else {
                if (currentRow >= 0) { 
                    strForRows.set(currentRow, strForRows.get(currentRow) + s.charAt(currentIndex));
                    currentRow--;
                    currentIndex++;
                } else {
                    downward = true;
                    currentRow += 2;
                }
            }
        }
        
        String answer = "";
        for (String row : strForRows) {
            answer += row;
        }
        return answer;
    }
}
