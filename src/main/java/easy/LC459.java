package easy;

public class LC459 {

    public boolean repeatedSubstringPattern(String s) {
        for(int i=1; i<=s.length()/2; i++){
            if(s.length() % i == 0){
                String occurrence = s.substring(0, i);
                boolean lengthIGood = true;
                int begin = i;
                while(begin < s.length()-i+1){
                    int end = begin + i;
                    if(!s.substring(begin, end).equals(occurrence)){
                        lengthIGood = false;
                        break;
                    }
                    begin = end;
                }
                if(lengthIGood){
                    return true;
                }
            }
        }
        return false;
    }
}
