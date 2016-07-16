public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null) return 0;
        if(nums.length<2) return nums.length;
        int prev=0;
        for(int i=1 ;i<nums.length;i++){
            while(i<nums.length && nums[prev]==nums[i]){
                i++;
            }
            if(i==nums.length) break;
            prev++;
            nums[prev]=nums[i];
        }
        return prev+1;
    }
}