public class Solution {
    private int[] origin;
    private int[] shuffle;
    public Solution(int[] nums) {
        this.origin = nums;
        this.shuffle = Arrays.copyOf(nums,nums.length);
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return origin;
    } 
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=shuffle.length-1;i>=0;i--){
            
            int index = (int)((Math.random()*(i+1)) % (i+1));
            int temp = shuffle[index];
            shuffle[index]= shuffle[i];
            shuffle[i] = temp;
        }
        return shuffle;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */