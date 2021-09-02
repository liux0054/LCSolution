package fun;

import java.util.Arrays;
import java.util.List;

public class FindKLargestAndIndex {
    public static void main(String[] args) {
//        System.out.println(isPalindrome(1));
//        System.out.println(isPalindrome(12));
//        System.out.println(isPalindrome(22));
//        System.out.println(isPalindrome(121));
//        System.out.println(isPalindrome(123));
        System.out.println(wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        System.out.println(wordBreak("applepenapple", Arrays.asList("apple", "pen")));
    }


    public static boolean isPalindrome(int x) {
        String xStr = Integer.toString(x);
        for (int i=0; i<xStr.length()/2; i++) {
            if (xStr.charAt(i) != xStr.charAt(xStr.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean isWord[][] = new boolean[s.length()][s.length()];
        for(int len=1; len<=s.length(); len++) {
            for (int start=0; start <= s.length()-len; start++) {
                int end=start+len-1;
                System.out.println("start: " + start);
                System.out.println("end: " + end);
                if (!isWord[start][end] && contains(s.substring(start, end+1), wordDict)) {
                    System.out.println("inside contains");
                    isWord[start][end] = true;
                    break;
                }
                for (int mid = start; mid<=end-1; mid++) {
                    System.out.println("mid+1 : " + (mid+1));
                    if (isWord[start][mid] && isWord[mid+1][end]) {
                        isWord[start][end] = true;
                        break;
                    }
                }
            }
        }
        return isWord[0][s.length()-1];
    }

    private static boolean contains(String s, List<String> wordDict) {
        for (String word : wordDict) {
            if (s.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
