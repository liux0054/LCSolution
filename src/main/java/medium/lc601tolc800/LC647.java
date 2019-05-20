package medium.lc601tolc800;

public class LC647 {
    public int countSubstrings(String s) {
        boolean[][] isPalindrom = new boolean[s.length()][s.length()];
        for(int i=0; i<s.length(); i++){
            isPalindrom[i][i] = true;
        }

        for(int length=2; length<=s.length(); length++){
            for(int begin=0; begin<=s.length()-length; begin++){
                int end = begin+length-1;
                isPalindrom[begin][end] = s.charAt(begin) == s.charAt(end);
                if(begin+1 < end){
                    isPalindrom[begin][end] = isPalindrom[begin+1][end-1] && isPalindrom[begin][end];
                }
            }
        }

        int answer = 0;
        for(boolean[] row:isPalindrom){
            for(boolean cell:row){
                if(cell){
                    answer++;
                }
            }
        }

        return answer;
    }
}