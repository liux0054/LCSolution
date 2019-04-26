package medium;

public class LC1016 {
    public boolean queryString(String S, int N) {
        for(int i=1; i<=N; i++){
            if(!S.contains(Integer.toString(i, 2))){
                return false;
            }
        }
        return true;
    }
}
