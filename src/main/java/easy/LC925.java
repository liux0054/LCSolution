package easy;

public class LC925 {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        int countOfSameCharName = 0;
        int countOfSameCharTyped = 0;
        while(j<typed.length() && typed.charAt(j) == name.charAt(0)){
            j++;
            countOfSameCharTyped++;
        }
        while(i<name.length() && name.charAt(i) == name.charAt(0)){
            i++;
            countOfSameCharName++;
        }

        if(j==typed.length() && i==name.length()){
            return true;
        }else if(j == typed.length() || i==name.length()){
            return false;
        }

        return j>0 && countOfSameCharTyped >= countOfSameCharName && isLongPressedName(name.substring(i), typed.substring(j));
    }
}
