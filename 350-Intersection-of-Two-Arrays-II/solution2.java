public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1==null || nums2==null) return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j =0;
        int index=0;
        int[] temp=new int[nums1.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                temp[index++]=nums2[j];
                i++;
                j++;
            } 
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        int[] res=new int[index];
        for(int k=0;k<index;k++){
            res[k]=temp[k];
        }
        return res;
    }
}