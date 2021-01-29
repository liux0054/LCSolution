package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class LC524 {
    public String findLongestWord(String s, List<String> d) {
        if (s == null || s.isEmpty() || d == null || d.isEmpty()) {
            return "";
        }
        TreeMap<Integer, TreeSet<String>> dic = new TreeMap<>();
        for (String word : d) {
            dic.putIfAbsent(word.length(), new TreeSet<>());
            dic.get(word.length()).add(word);
        }

        List<Integer> keyList = new ArrayList<>(dic.keySet());
        Collections.reverse(keyList);
        for (int key : keyList) {
            for (String word : dic.get(key)) {
                if (isSubSe(s, word)) {
                    return word;
                }
            }
        }

        return "";
    }

    //s1 long, s2 short
    private boolean isSubSe(String s1, String s2) {
        int j = 0;
        for (int i=0; i<s1.length() && j<s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }
        return j == s2.length();
    }

    //s1 long, s2 short
    private boolean s1CanBeS2(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s1.toCharArray()) {
            charCount.putIfAbsent(c, 0);
            charCount.put(c, charCount.get(c) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        for (Integer count : charCount.values()) {
            if (count < 0) {
                return false;
            }
        }

        int[][] commonLen = new int[1001][1001];

        for (int i=0; i<s1.length(); i++) {
            for (int j=0; j<s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (i-1 >=0 && j-1>=0) {
                        commonLen[i][j] = commonLen[i-1][j-1] + 1;
                    } else {
                        commonLen[i][j] = 1;
                    }
                } else {
                    commonLen[i][j] = Math.max(
                            Math.max(i-1>=0 ? commonLen[i-1][j] : 0, j-1>=0 ? commonLen[i][j-1] : 0),
                            i-1 >= 0 && j-1 >= 0 ? commonLen[i-1][j-1] : 0
                    );
                }
            }
        }

        return commonLen[s1.length() - 1][s2.length() - 1] == s2.length();
    }
}
