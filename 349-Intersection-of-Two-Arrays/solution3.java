public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //use binary search to find whether nums2[i] is in nums1
        Arrays.sort(nums1);
        //use hashset to store the same element
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums2.length;i++){
            if(binarySearch(nums1,nums2[i])){
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
    private boolean binarySearch(int[] nums, int target){
         if (nums == null || nums.length == 0) {
            return false;
        }
        
        int start = 0, end = nums.length - 1;
        while (start<= end) {
            int mid = (end + start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return false;
    }
}