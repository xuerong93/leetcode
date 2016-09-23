public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length<1) return -1;
        if(nums.length == 1 || nums[0]>nums[1]) return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int start = 0;
        int end = nums.length-1;
        return peakNumber(nums,start, end);
    }
    public int peakNumber(int[] nums, int start, int end){
        if(start == end) return start;

            int mid = (start+end)/2;
            
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if(nums[mid]<nums[mid-1]){
                    return peakNumber(nums,start,mid);
                }
                else{
                    return peakNumber(nums,mid,end);
                }
    }
}