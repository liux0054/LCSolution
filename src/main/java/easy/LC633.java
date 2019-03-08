package easy;

public class LC633 {

    public boolean judgeSquareSum(int c) {
       for(int i=0; i<=(int)(Math.sqrt(c)); i++){
           if ((int)Math.sqrt(c - i*i) == Math.sqrt(c - i*i)){
               return true;
           }
       }
       return false;
    }
}
