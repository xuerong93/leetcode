public class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        for(int i=0;i<k && i<=(nums.length-1)/2;i++){
            swap(nums,i,nums.length-i-1);
        }
        
        reverse(nums,k,nums.length-1-k);
    }
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;j--;
        }
    }
    public void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}