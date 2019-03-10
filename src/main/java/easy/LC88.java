package easy;

public class LC88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] intermediaArray = new int[m+n];
        int i=0, j=0, index=0;
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                intermediaArray[index] = nums1[i];
                index++;
                i++;
            }else{
                intermediaArray[index] = nums2[j];
                index++;
                j++;
            }
        }
        if(i<m){
            for(int k=i; k<m; k++){
                intermediaArray[index] = nums1[k];
                index++;
            }
        }else{
            for(int k=j; k<n; k++){
                intermediaArray[index] =nums2[k];
                index++;
            }
        }

        for(int k=0; k<intermediaArray.length; k++){
            nums1[k] = intermediaArray[k];
        }
    }
}
