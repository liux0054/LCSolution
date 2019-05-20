package easy.lc201tolc400;

public class LC367 {

    public boolean isPerfectSquare(int num) {
        long begin = 1, end = num;
        while(end-begin != 1){
            long mid = (begin + end)/2;
            if(mid * mid == num){
                return true;
            }else if(mid * mid < num){
                begin = mid;
            }else{
                end = mid;
            }
        }
        return false;
    }
}
