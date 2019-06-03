package medium;

public class LC74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        int end = matrix.length * matrix[0].length-1;
        int begin = 0;
        while(begin <= end){
            int mid = (begin + end)/2;
            int potential = matrix[mid / matrix[0].length][mid % matrix[0].length];
            if(potential == target){
                return true;
            }else if(potential < target) {
                begin = mid;
            }else{
                end = mid;
            }
            if(begin + 1 >= end ){
                if(matrix[end / matrix[0].length][end % matrix[0].length] == target ||
                    matrix[begin / matrix[0].length][begin % matrix[0].length] == target){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
}
