public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<m;i++){
            nums1[m+n-i-1]=nums1[m-1-i];
        }
        int i=n;
        int j=0;
        int k=0;
        while(i<m+n && j<n){
            if(nums1[i]<=nums2[j]){
                nums1[k]=nums1[i];
                i++;
            }else{
                nums1[k]=nums2[j];
                j++;
            }
            k++;
        }
        if(i==m+n){
            for(int a=n-1;a>=j;a--){
                nums1[m+a]=nums2[a];
            }
        }
        
    }
}