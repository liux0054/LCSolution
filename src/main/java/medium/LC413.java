package medium;


public class LC413 {
    public int numberOfArithmeticSlices(int[] A) {
        if(A == null || A.length == 0){
            return 0;
        }

        int[] diffs = new int[A.length-1];

        for(int i=1; i<A.length; i++){
            diffs[i-1] = A[i] - A[i-1];
        }

        int answer = 0;
        int countOfDuplicated = 0;
        int start = 0;
        while(start < diffs.length){
            int i = start;
            while(i<diffs.length && diffs[i] == diffs[start]){
                countOfDuplicated++;
                i++;
            }
            answer += countOfDuplicated * (countOfDuplicated -1) / 2;
            start = i;
            countOfDuplicated = 0;
        }
        return answer;
    }
}
