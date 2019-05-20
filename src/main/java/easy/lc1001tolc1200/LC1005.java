package easy.lc1001tolc1200;

import java.util.Arrays;

public class LC1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int i = 0;
        while(i<A.length && K>0 && A[i] < 0){
            K--;
            A[i] = -A[i];
            i++;
        }

        int sumWhole = 0;
        for(int j=0; j<A.length; j++){
            sumWhole += A[j];
        }
        Arrays.sort(A);
        int sumExceptFirst = sumWhole - 2 * A[0];
        if(K == 0){
            return sumWhole;
        }else{
            Arrays.sort(A);
            if(K % 2 == 0){
                return sumWhole;
            }else{
                return sumExceptFirst;
            }
        }
    }
}
