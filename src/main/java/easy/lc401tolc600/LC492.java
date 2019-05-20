package easy.lc401tolc600;

public class LC492 {
    public int[] constructRectangle(int area) {
        int sqRoot = (int) Math.sqrt(area);
        for(int i=sqRoot; i>=1; i--){
            if(area % i == 0){
                return new int[]{area/i, i};
            }
        }
        return null;
    }
}
