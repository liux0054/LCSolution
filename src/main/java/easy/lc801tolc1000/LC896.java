package easy.lc801tolc1000;

public class LC896 {
    public boolean isMonotonic(int[] A) {
       if(A.length == 1 || A.length == 2){
           return true;
       }

       int[] diff = new int[A.length-1];
       for(int i=0; i<diff.length; i++){
           diff[i] = A[i] - A[i+1];
       }

       int i=0;
       while(i < diff.length && diff[i] >= 0){
           i++;
       }

       if(i == diff.length){
           return true;
       }

        i=0;
        while(i < diff.length && diff[i] <= 0){
            i++;
        }

        if(i == diff.length){
            return true;
        }

        return false;
    }
}
