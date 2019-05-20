package medium.lc801tolc1000;

import java.util.TreeSet;

public class LC866 {

    public int primePalindrome(int N) {
        if(N==1) return 2;
        final int MAX = (int)(Math.sqrt(2 * 100000000)) + 1;
        final int MAX_RANGE = 2 * 100000000;
        boolean[] isNotPrime = new boolean[MAX];
        isNotPrime[2] = false;
        int i = 2;
        while(i < MAX){
            if(!isNotPrime[i]){
                int j = i + i;
                while(j < MAX){
                    isNotPrime[j] = true;
                    j += i;
                }
            }
            i++;
        }

        TreeSet<Integer> primeSet = new TreeSet<>();
        for(i=2; i<MAX; i++){
            if(!isNotPrime[i]){
                primeSet.add(i);
            }
        }

        for(i=N; i<MAX_RANGE; i++){
            if(Integer.toString(i).equals(new StringBuffer(Integer.toString(i)).reverse().toString())){
                boolean intIsPrime = true;
                if(primeSet.contains(i)) break;
                for(Integer prime:primeSet){
                    if(i % prime == 0){
                        intIsPrime = false;
                        break;
                    }
                    if( (int)Math.sqrt(i) < prime) break;

                }
                if(intIsPrime) return i;
            }
        }
        return i;
    }
}
