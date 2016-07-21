public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //use binary search to find whether nums2[i] is in nums1
        Arrays.sort(nums1);
        //use hashset to store the same element
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums2.length;i++){
            if(binarySearch(nums1,nums2[i],0,nums1.length-1)){
                set.add(nums2[i]);
            }
        }
        int[] res=new int[set.size()];
        int k=0;
        for(int num:set){
            res[k++]=num;
        }
        return res;
    }
    private boolean binarySearch(int[] arr, int num, int start, int end){
        if(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==num) return true;
            else if(arr[mid]<num) return binarySearch(arr,num,mid+1,end);
            else return binarySearch(arr,num,start,mid-1);
        }
        return false;
    }
}