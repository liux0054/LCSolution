package medium;

public class LC345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        String vowels = "aoeiuAOEIU";
        while (i < j) {
            while (i < chars.length && vowels.indexOf(chars[i]) == -1) {
                i++;
            }
            while (j >= 0 && vowels.indexOf(chars[j]) == -1) {
                j--;
            }
            if (i < j && i < chars.length) {
                char c = chars[i];
                chars[i] = chars[j];
                chars[j] = c;
                i++;
                j--;
            }
        }
        return new String(chars);
    }
}
