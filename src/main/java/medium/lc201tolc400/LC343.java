package medium.lc201tolc400;

public class LC343 {
    public int integerBreak(int n) {
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        int numberOfRoot = (int) Math.sqrt(n);
        return Math.max(getPotentialAnswer(numberOfRoot+1, n), Math.max(getPotentialAnswer(numberOfRoot, n), getPotentialAnswer(numberOfRoot - 1, n)));
    }

    private int getPotentialAnswer(int numberOfRoot, int n){
        int root = n / numberOfRoot;
        int reminder = n - root % numberOfRoot;
        int answer = 1;
        for(int i=0; i<numberOfRoot-reminder; i++){
            answer *= root;
        }
        for(int i=0; i<reminder; i++){
            answer *= root+1;
        }
        return answer;
    }
}
