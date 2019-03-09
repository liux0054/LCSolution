package easy;

public class LC984 {
    public String strWithout3a3b(int A, int B) {
        int bigger;
        int smaller;
        boolean aIsBigger = false;
        if(A > B){
            bigger = A;
            smaller = B;
            aIsBigger = true;
        }else{
            bigger = B;
            smaller = A;
        }

        String bigChar;
        String smallChar;
        if(aIsBigger){
            bigChar = "a";
            smallChar = "b";
        }else{
            bigChar="b";
            smallChar="a";
        }

        if(bigger == 1){
            if(smaller == 0) {
                return bigChar;
            }else{
                return bigChar + smallChar;
            }
        }
        int[] placeOfAandB = new int[200];
        int i=0;
        while(bigger>0 && smaller>=0){
            if(i % 2 == 0){
                if(bigger >= 2){
                    placeOfAandB[i] = 2;
                    bigger -= 2;
                }else{
                    placeOfAandB[i] = 1;
                    bigger -= 1;
                }
            }else{
                placeOfAandB[i] = 1;
                smaller -= 1;
            }
            i++;
        }
        if(smaller > 0){
            int j = 1;
            while (smaller > 0){
                int inter = Math.min(2 - placeOfAandB[j], smaller);
                placeOfAandB[j] += inter;
                smaller -= inter;
                j += 2;
            }
        }

        String ans="";
        i=0;
        while(placeOfAandB[i] != 0){
            if(i % 2 == 0){
                if(placeOfAandB[i] == 2){
                    ans += bigChar + bigChar;
                }else{
                    ans += bigChar;
                }
            }else{
                if(placeOfAandB[i] == 2){
                    ans += smallChar + smallChar;
                }else{
                    ans += smallChar;
                }
            }
            i++;
        }
        return ans;
    }
}
