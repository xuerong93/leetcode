public class Solution {
    public int singleNumber(int[] nums) {
        //without extra space
        //use xor because the same number xor is 0
        int a =0 ;
        for(int i = 0; i < nums.length; i++){
            a=a^nums[i];
        }
        return a;
        
    }
}