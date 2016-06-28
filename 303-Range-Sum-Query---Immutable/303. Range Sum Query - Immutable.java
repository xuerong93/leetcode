public class NumArray {
    private int[] dp;
    public NumArray(int[] nums) {
        dp=new int[nums.length+1];
        if(nums.length>0){
            dp[0]=0;
            for(int i=0;i<nums.length;i++){
                dp[i+1]=dp[i]+nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        return (j-i<0)?0:(dp[j+1]-dp[i]);
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);