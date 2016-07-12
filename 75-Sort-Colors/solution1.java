public class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0 || nums.length==1)  return;
        int index0=0;//the start of the blue pointer 
        int index1=0;//the start of the white pointer
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){// if the color is red
                nums[i]=2;
                nums[index1++]=1;
                nums[index0++]=0;
            }
            else if(nums[i]==1){
                nums[i]=2;
                nums[index1++]=1;
            }
        }
    }
}