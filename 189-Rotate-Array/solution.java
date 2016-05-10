public class Solution {
    public void rotate(int[] nums, int k) {
        k =k % nums.length;
        exchange(nums,0,nums.length-k-1);
        exchange(nums,nums.length-k,nums.length-1);
        exchange(nums,0,nums.length-1);
    }
    
    public void exchange(int[] nums,int start,int end){
        if(start>end) return;
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}