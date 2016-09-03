public class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int start = 0;
        int end = length-1;
        while(start<=end){
            while(start<length && nums[start]!=val){
                start++;
            } 
            while(end>=0 && nums[end]==val){
                end--;
            } 
            if(start<end){
                swap(nums,start,end);
                start++;
                end--;
            }
            
        }
        return start;
    }
    public void swap(int[] nums, int start, int end ){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        
    }
}