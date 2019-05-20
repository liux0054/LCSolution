package medium.lc201tolc400;

public class LC264 {

    public int nthUglyNumber(int n) {
        int i = 1;
        int originI = i;
        while(true){
           i = originI;
           while(i % 2 == 0){
               i = i/2;
           }
           while(i % 3 == 0){
               i = i/3;
           }
           while(i % 5 ==0){
               i = i/5;
           }
           if(i == 1){
               n--;
           }
           if(n == 0){
               return originI;
           }
           originI++;
        }
    }
}
