public class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] res = new int[nums.length];
        int num = 0;
        for(int i=k; i<nums.length;i++){
            res[i]=nums[num];
            num++;
        }
        num = nums.length-k;
        for(int i =0; i<k;i++){
            res[i] = nums[num];
            num++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = res[i];
        }
    }
}