package easy.lc201tolc400;

public class LC326 {
    public boolean isPowerOfThree(int n) {
        if(n == 1){
            return true;
        }else if(n == 0){
            return false;
        } else{
            return n % 3 == 0 && isPowerOfThree(n/3);
        }
    }
}
