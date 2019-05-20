package medium.lc1tolc200;

public class LC91 {
    public int numDecodings(String s) {
        int[] numberOfMethods = new int[s.length()+1];
        if(s.charAt(0) == '0') numberOfMethods[1] = 0;
        else numberOfMethods[1] = 1;
        numberOfMethods[0] = 1;
        for(int i=2; i<numberOfMethods.length; i++){
            String s2 = s.substring(i-2,i);
            String s1 = s.substring(i-1,i);
            int current2Int = Integer.parseInt(s2);
            int current1Int = Integer.parseInt(s1);
            if(current1Int != 0){
                if(s2.startsWith("0")){
                    numberOfMethods[i] = numberOfMethods[i-1];
                }
                else{
                    if(current2Int >= 1 && current2Int <= 26){
                        numberOfMethods[i] = numberOfMethods[i-1] + numberOfMethods[i-2];
                    }else{
                        numberOfMethods[i] = numberOfMethods[i-1];
                    }
                }
            }else{
                if(current2Int >= 1 && current2Int <= 26){
                    numberOfMethods[i] = numberOfMethods[i-2];
                }else{
                    return 0;
                }
            }
        }
        return numberOfMethods[numberOfMethods.length-1];
    }
}
