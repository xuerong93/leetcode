public class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int k =0;
        for(int i=0;i<nums.length;i++){
            while(k<nums.length && nums[k]!=0){
                k++;
            }
            if(k==nums.length) break;
            
            if(nums[i]!=0){
                if(k<i){
                    int temp=nums[i];
                    nums[i]=nums[k];
                    nums[k]=temp;
                    k++;
                }
            }
        }
    }
}