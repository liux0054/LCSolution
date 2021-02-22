package medium;

import java.util.ArrayList;
import java.util.List;

public class LC1177 {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> answer = new ArrayList<>();
        int[][] charCount = new int[100000][26];
        charCount[0][s.charAt(0) - 'a']++;
        for (int i=1; i<s.length(); i++) {
            System.arraycopy(charCount[i-1], 0, charCount[i], 0, 26);
            charCount[i][s.charAt(i) - 'a']++;
        }
        for (int[] query : queries) {
            answer.add(differenceCharsSymmetry(query[0], query[1], charCount)/2 <= query[2]);
        }
        return answer;
    }

    private int differenceCharsSymmetry(int start, int end, int[][] charCount) {
        int numberOfOdd = 0;
        for (int i=0; i<26; i++) {
            if ((charCount[end][i] - (start > 0 ? charCount[start-1][i] : 0)) % 2 == 1) {
                numberOfOdd++;
            }
        }
        return numberOfOdd;
    }
}
