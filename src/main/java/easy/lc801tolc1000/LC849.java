package easy.lc801tolc1000;

import java.util.Arrays;

public class LC849 {
    public int maxDistToClosest(int[] seats) {
        String seatStr = Arrays.toString(seats).replace(",", "").replace(" ", "");
        String ans = "0";
        int i;
        seatStr = seatStr.trim().substring(1, seatStr.length()-1);
        for(i=1; i<seatStr.length(); i++){
            if(seatStr.indexOf(ans) == -1) {
                break;
            }
            ans += "0";
        }
        return Math.max(Math.max(seatStr.indexOf("1"), seatStr.length() - 1 - seatStr.lastIndexOf("1")), i/2);
    }
}
