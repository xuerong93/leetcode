public class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0 || nums.length==1) return;
        //three way partitioning/dutch partitioning
        int i=0;
        int k=0;
        int j=nums.length-1;
        while(k<=j){
            if(nums[k]<1){
                swap(nums,i,k);
                i++;
                k++;
            }else if(nums[k]>1){
                swap(nums,k,j);
                j--;
            }
            else{
                k++;
            }
        }
    }
    public void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}