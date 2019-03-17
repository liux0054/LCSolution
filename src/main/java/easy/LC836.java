package easy;

public class LC836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return isOverlap(rec1[0], rec1[2], rec2[0], rec2[2]) && isOverlap(rec1[1], rec1[3], rec2[1], rec2[3]);
    }

    private boolean isOverlap(int a1, int a2, int a3, int a4){
        return !(a2 <= a3 || a4 <= a1);
    }
}
