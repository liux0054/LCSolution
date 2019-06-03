package easy;

public class LC941 {
    public boolean validMountainArray(int[] A) {
        if(A.length < 3){
            return false;
        }

        int[] diff = new int[A.length-1];
        for(int i=0; i<diff.length; i++){
            diff[i] = A[i] - A[i+1];
        }

        int i = 0;

        while(i < diff.length && diff[i] < 0) {
            i++;
        }

        if(i==0 || i>= diff.length){
            return false;
        }

        while(i<diff.length && diff[i] > 0){
            i++;
        }

        return i >= diff.length;
    }
}
