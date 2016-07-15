public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums==null) return 0;
        int length=nums.length;
        int i=0;
        int j=length-1;
        int count=0;
        while(i<=j){
            if(nums[i]==val){
                swap(nums,i,j);
                j--;
                count++;
            }
            else{
                i++;
            }
        }
        return length-count;
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}