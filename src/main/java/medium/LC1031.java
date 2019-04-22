package medium;

public class LC1031 {
    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
       int[] sums = new int[A.length];
       sums[0] = A[0];
       for (int i=1; i<A.length; i++){
           sums[i] += sums[i-1] + A[i];
       }

       int[] sumL = getSums(L, sums, A);
       int[] sumM = getSums(M, sums, A);

       int answer = getMax(A, sumL, sumM, L, M, 0);
       answer = getMax(A, sumM, sumL, M, L, answer);
       return answer;
    }

    private int[] getSums(int length, int[] sums, int[] A){
        int[] sumLength = new int[A.length];
        sumLength[0] = sums[length-1];

        for(int i=1; i<A.length-length; i++){
            sumLength[i] = sums[i+length-1] - sums[i-1];
        }

        for(int i=A.length-length; i<A.length; i++){
            sumLength[i] = sums[A.length-1] - sums[i-1];
        }

        return sumLength;
    }

    private int getMax(int[] A, int[] sumL, int[] sumM, int L, int M, int answer){
        for(int i=0; i<A.length-L-M+1; i++){
            for(int j=i+L; j<A.length; j++){
                if(sumL[i]+ sumM[j] > answer){
                    answer = sumL[i]+ sumM[j];
                }
            }
        }
        return answer;
    }
}
